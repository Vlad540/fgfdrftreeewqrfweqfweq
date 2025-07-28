package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.a;

public class SupportMapFragment extends a {
    public final yha p1 = new yha(this);

    public final void A0() {
        yha yha = this.p1;
        v2b v2b = (v2b) yha.a;
        if (v2b != null) {
            try {
                s4g s4g = (s4g) v2b.c;
                s4g.H0(s4g.G0(), 7);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            yha.c(2);
        }
        this.W0 = true;
    }

    public final void F0(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.W0 = true;
            yha yha = this.p1;
            yha.Z = activity;
            yha.e();
            GoogleMapOptions b = GoogleMapOptions.b(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", b);
            yha.d(bundle, new azf(yha, activity, bundle2, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void I0() {
        yha yha = this.p1;
        v2b v2b = (v2b) yha.a;
        if (v2b != null) {
            try {
                s4g s4g = (s4g) v2b.c;
                s4g.H0(s4g.G0(), 6);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            yha.c(5);
        }
        this.W0 = true;
    }

    public final void L0() {
        this.W0 = true;
        yha yha = this.p1;
        yha.getClass();
        yha.d((Bundle) null, new a0g(yha, 1));
    }

    public final void M0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        yha yha = this.p1;
        v2b v2b = (v2b) yha.a;
        if (v2b != null) {
            try {
                Bundle bundle2 = new Bundle();
                h2g.I(bundle, bundle2);
                s4g s4g = (s4g) v2b.c;
                Parcel G0 = s4g.G0();
                u1g.b(G0, bundle2);
                Parcel R = s4g.R(G0, 10);
                if (R.readInt() != 0) {
                    bundle2.readFromParcel(R);
                }
                R.recycle();
                h2g.I(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            Bundle bundle3 = (Bundle) yha.b;
            if (bundle3 != null) {
                bundle.putAll(bundle3);
            }
        }
    }

    public final void N0() {
        this.W0 = true;
        yha yha = this.p1;
        yha.getClass();
        yha.d((Bundle) null, new a0g(yha, 0));
    }

    public final void O0() {
        yha yha = this.p1;
        v2b v2b = (v2b) yha.a;
        if (v2b != null) {
            try {
                s4g s4g = (s4g) v2b.c;
                s4g.H0(s4g.G0(), 16);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            yha.c(4);
        }
        this.W0 = true;
    }

    public final void onLowMemory() {
        v2b v2b = (v2b) this.p1.a;
        if (v2b != null) {
            try {
                s4g s4g = (s4g) v2b.c;
                s4g.H0(s4g.G0(), 9);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        }
        this.W0 = true;
    }

    public final void s0(Bundle bundle) {
        ClassLoader classLoader = SupportMapFragment.class.getClassLoader();
        if (!(bundle == null || classLoader == null)) {
            bundle.setClassLoader(classLoader);
        }
        this.W0 = true;
    }

    public final void u0(Activity activity) {
        this.W0 = true;
        yha yha = this.p1;
        yha.Z = activity;
        yha.e();
    }

    public void w0(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.w0(bundle);
            yha yha = this.p1;
            yha.getClass();
            yha.d(bundle, new jzf(yha, bundle));
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public View y0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        yha yha = this.p1;
        yha.getClass();
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        yha.d(bundle, new uzf(yha, frameLayout, layoutInflater, viewGroup, bundle));
        if (((v2b) yha.a) == null) {
            ma6 ma6 = ma6.d;
            Context context = frameLayout.getContext();
            int b = ma6.b(context, na6.a);
            String c = izf.c(context, b);
            String b2 = izf.b(context, b);
            LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            frameLayout.addView(linearLayout);
            TextView textView = new TextView(frameLayout.getContext());
            textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            textView.setText(c);
            linearLayout.addView(textView);
            Intent a = ma6.a(b, context, (String) null);
            if (a != null) {
                Button button = new Button(context);
                button.setId(16908313);
                button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                button.setText(b2);
                linearLayout.addView(button);
                button.setOnClickListener(new fq(context, 6, a));
            }
        }
        frameLayout.setClickable(true);
        return frameLayout;
    }

    public final void z0() {
        yha yha = this.p1;
        v2b v2b = (v2b) yha.a;
        if (v2b != null) {
            try {
                s4g s4g = (s4g) v2b.c;
                s4g.H0(s4g.G0(), 8);
            } catch (RemoteException e) {
                throw new RuntimeException(e);
            }
        } else {
            yha.c(1);
        }
        this.W0 = true;
    }
}
