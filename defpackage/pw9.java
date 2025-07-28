package defpackage;

import android.support.v4.media.session.PlaybackStateCompat;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* renamed from: pw9  reason: default package */
public final class pw9 {
    public int A;
    public long B;
    public ea6 C;
    public stf a = new stf(7);
    public gvf b = new gvf(9);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public k2e e = new k2e();
    public boolean f = true;
    public y76 g;
    public boolean h;
    public boolean i;
    public oa2 j;
    public lu7 k;
    public Proxy l;
    public ProxySelector m;
    public y76 n;
    public SocketFactory o;
    public SSLSocketFactory p;
    public X509TrustManager q;
    public List r;
    public List s;
    public HostnameVerifier t;
    public iy1 u;
    public n06 v;
    public int w;
    public int x;
    public int y;
    public int z;

    public pw9() {
        y76 y76 = y76.b;
        this.g = y76;
        this.h = true;
        this.i = true;
        this.j = oa2.b;
        this.k = lu7.a;
        this.n = y76;
        this.o = SocketFactory.getDefault();
        this.r = qw9.T0;
        this.s = qw9.S0;
        this.t = ow9.a;
        this.u = iy1.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.B = PlaybackStateCompat.ACTION_PLAY_FROM_MEDIA_ID;
    }
}
