package org.apache.http.impl.conn;

import java.io.IOException;
import java.net.Socket;
import org.apache.http.HttpHost;
import org.apache.http.conn.ClientConnectionOperator;
import org.apache.http.conn.OperatedClientConnection;
import org.apache.http.conn.routing.HttpRoute;
import org.apache.http.conn.routing.RouteTracker;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HttpContext;

@Deprecated
public abstract class AbstractPoolEntry {
    protected final ClientConnectionOperator connOperator;
    protected final OperatedClientConnection connection;
    protected volatile HttpRoute route;
    protected volatile Object state;
    protected volatile RouteTracker tracker;

    public AbstractPoolEntry(ClientConnectionOperator clientConnectionOperator, HttpRoute httpRoute) {
        if (clientConnectionOperator != null) {
            this.connOperator = clientConnectionOperator;
            this.connection = clientConnectionOperator.createConnection();
            this.route = httpRoute;
            this.tracker = null;
            return;
        }
        throw new IllegalArgumentException("Connection operator may not be null");
    }

    public Object getState() {
        return this.state;
    }

    public void layerProtocol(HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.tracker == null || !this.tracker.isConnected()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.tracker.isTunnelled()) {
            throw new IllegalStateException("Protocol layering without a tunnel not supported.");
        } else if (!this.tracker.isLayered()) {
            this.connOperator.updateSecureConnection(this.connection, this.tracker.getTargetHost(), httpContext, httpParams);
            this.tracker.layerProtocol(this.connection.isSecure());
        } else {
            throw new IllegalStateException("Multiple protocol layering not supported.");
        }
    }

    public void open(HttpRoute httpRoute, HttpContext httpContext, HttpParams httpParams) throws IOException {
        if (httpRoute == null) {
            throw new IllegalArgumentException("Route must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.tracker == null || !this.tracker.isConnected()) {
            this.tracker = new RouteTracker(httpRoute);
            HttpHost proxyHost = httpRoute.getProxyHost();
            this.connOperator.openConnection(this.connection, proxyHost != null ? proxyHost : httpRoute.getTargetHost(), httpRoute.getLocalAddress(), httpContext, httpParams);
            RouteTracker routeTracker = this.tracker;
            if (routeTracker == null) {
                throw new IOException("Request aborted");
            } else if (proxyHost == null) {
                routeTracker.connectTarget(this.connection.isSecure());
            } else {
                routeTracker.connectProxy(proxyHost, this.connection.isSecure());
            }
        } else {
            throw new IllegalStateException("Connection already open.");
        }
    }

    public void setState(Object obj) {
        this.state = obj;
    }

    public void shutdownEntry() {
        this.tracker = null;
    }

    public void tunnelProxy(HttpHost httpHost, boolean z, HttpParams httpParams) throws IOException {
        if (httpHost == null) {
            throw new IllegalArgumentException("Next proxy must not be null.");
        } else if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.tracker == null || !this.tracker.isConnected()) {
            throw new IllegalStateException("Connection not open.");
        } else {
            this.connection.update((Socket) null, httpHost, z, httpParams);
            this.tracker.tunnelProxy(httpHost, z);
        }
    }

    public void tunnelTarget(boolean z, HttpParams httpParams) throws IOException {
        if (httpParams == null) {
            throw new IllegalArgumentException("Parameters must not be null.");
        } else if (this.tracker == null || !this.tracker.isConnected()) {
            throw new IllegalStateException("Connection not open.");
        } else if (!this.tracker.isTunnelled()) {
            this.connection.update((Socket) null, this.tracker.getTargetHost(), z, httpParams);
            this.tracker.tunnelTarget(z);
        } else {
            throw new IllegalStateException("Connection is already tunnelled.");
        }
    }
}
