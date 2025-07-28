package ru.ok.android.externcalls.sdk.net.internal;

import kotlin.Metadata;
import org.webrtc.NetworkMonitor;
import ru.ok.android.externcalls.sdk.net.NetworkConnectionManager;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0018\u0010\u0012\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lru/ok/android/externcalls/sdk/net/internal/NetworkConnectionManagerImpl;", "Lru/ok/android/externcalls/sdk/net/NetworkConnectionManager;", "Lgx0;", "call", "<init>", "(Lgx0;)V", "Lle0;", "callback", "Ljue;", "registerBadConnectionCallback", "(Lle0;)V", "unregisterBadConnectionCallback", "Lqh9;", "listener", "addNetworkConnectivityListener", "(Lqh9;)V", "removeNetworkConnectivityListener", "Lbne;", "plusAssign", "(Lbne;)V", "minusAssign", "Lgx0;", "Lane;", "getTopology", "()Lane;", "topology", "calls-sdk_release"}, k = 1, mv = {1, 9, 0})
public final class NetworkConnectionManagerImpl implements NetworkConnectionManager {
    private final gx0 call;

    public NetworkConnectionManagerImpl(gx0 gx0) {
        this.call = gx0;
    }

    public void addNetworkConnectivityListener(qh9 qh9) {
        if (this.call.u1.add(qh9)) {
            NetworkMonitor.isOnline();
            qh9.a();
        }
    }

    public ane getTopology() {
        return this.call.x1.y();
    }

    public void minusAssign(bne bne) {
        this.call.v1.remove(bne);
    }

    public void plusAssign(bne bne) {
        this.call.v1.add(bne);
    }

    public void registerBadConnectionCallback(le0 le0) {
        gx0 gx0 = this.call;
        if (gx0.b1) {
            gx0.a1.k.add(le0);
        } else {
            gx0.Z0.log("OKRTCCall", "Using registerBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }

    public void removeNetworkConnectivityListener(qh9 qh9) {
        this.call.u1.remove(qh9);
    }

    public void unregisterBadConnectionCallback(le0 le0) {
        gx0 gx0 = this.call;
        if (gx0.b1) {
            gx0.a1.k.remove(le0);
        } else {
            gx0.Z0.log("OKRTCCall", "Using unregisterBadConnectionCallback w/ enableLossRttBadConnectionHandling disabled, ignoring");
        }
    }
}
