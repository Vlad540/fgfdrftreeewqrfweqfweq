package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

/* renamed from: uzf  reason: default package */
public final class uzf implements h0g {
    public final /* synthetic */ FrameLayout a;
    public final /* synthetic */ LayoutInflater b;
    public final /* synthetic */ ViewGroup c;
    public final /* synthetic */ Bundle d;
    public final /* synthetic */ yha e;

    public uzf(yha yha, FrameLayout frameLayout, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.e = yha;
        this.a = frameLayout;
        this.b = layoutInflater;
        this.c = viewGroup;
        this.d = bundle;
    }

    public final int a() {
        return 2;
    }

    public final void b() {
        StrictMode.ThreadPolicy threadPolicy;
        FrameLayout frameLayout = this.a;
        frameLayout.removeAllViews();
        v2b v2b = (v2b) this.e.a;
        LayoutInflater layoutInflater = this.b;
        ViewGroup viewGroup = this.c;
        Bundle bundle = this.d;
        v2b.getClass();
        try {
            Bundle bundle2 = new Bundle();
            h2g.I(bundle, bundle2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            s4g s4g = (s4g) v2b.c;
            ks9 ks9 = new ks9(layoutInflater);
            ks9 ks92 = new ks9(viewGroup);
            Parcel G0 = s4g.G0();
            u1g.c(G0, ks9);
            u1g.c(G0, ks92);
            u1g.b(G0, bundle2);
            Parcel R = s4g.R(G0, 4);
            un6 K0 = ks9.K0(R.readStrongBinder());
            R.recycle();
            StrictMode.setThreadPolicy(threadPolicy);
            h2g.I(bundle2, bundle);
            frameLayout.addView((View) ks9.L0(K0));
        } catch (RemoteException e2) {
            throw new RuntimeException(e2);
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }
}
