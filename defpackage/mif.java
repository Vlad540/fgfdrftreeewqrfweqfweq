package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.a;
import androidx.fragment.app.b;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import ru.ok.messages.views.widgets.TamAvatarView;

/* renamed from: mif  reason: default package */
public final class mif implements tle {
    public Object X;
    public Object Y;
    public Object a;
    public Object b;
    public Object c;
    public Object o;

    public mif(im imVar, s16 s16, s16 s162) {
        this.a = imVar;
        this.b = s16;
        this.c = s162;
        this.o = mif.class.getName();
        this.X = ez3.O(3, new kif(this, 0));
        this.Y = ez3.O(3, new kif(this, 1));
    }

    public static z54 a(DataInputStream dataInputStream) {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i < readInt) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = oze.f;
                int i2 = 0;
                while (i2 != readInt2) {
                    int i3 = i2 + min;
                    bArr = Arrays.copyOf(bArr, i3);
                    dataInputStream.readFully(bArr, i2, min);
                    min = Math.min(readInt2 - i3, 10485760);
                    i2 = i3;
                }
                hashMap.put(readUTF, bArr);
                i++;
            } else {
                throw new IOException(wn6.h(readInt2, "Invalid value size: "));
            }
        }
        return new z54(hashMap);
    }

    public static void b(z54 z54, DataOutputStream dataOutputStream) {
        Set<Map.Entry> entrySet = z54.b.entrySet();
        dataOutputStream.writeInt(entrySet.size());
        for (Map.Entry entry : entrySet) {
            dataOutputStream.writeUTF((String) entry.getKey());
            byte[] bArr = (byte[]) entry.getValue();
            dataOutputStream.writeInt(bArr.length);
            dataOutputStream.write(bArr);
        }
    }

    public void c(stf stf, String str, String str2) {
        String string = ((b) this.a).getString(cic.r);
        if (!(true ^ (str2 == null || str2.length() == 0))) {
            str2 = null;
        }
        if (!TextUtils.isEmpty(str)) {
            boolean p = h2g.p(15);
            if (TextUtils.isEmpty(string) && !p) {
                throw new IllegalArgumentException("Negative text must be set and non-empty.");
            } else if (TextUtils.isEmpty(string) || !p) {
                ex exVar = new ex(str, str2, string);
                t97 t97 = (t97) this.Y;
                if (stf == null) {
                    ((zl0) t97.getValue()).a(exVar, (stf) null);
                    return;
                }
                zl0 zl0 = (zl0) t97.getValue();
                zl0.getClass();
                if (true & true) {
                    throw new IllegalArgumentException("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
                } else if (Build.VERSION.SDK_INT >= 30 || !h2g.p(15)) {
                    zl0.a(exVar, stf);
                } else {
                    throw new IllegalArgumentException("Crypto-based authentication is not supported for device credential prior to API 30.");
                }
            } else {
                throw new IllegalArgumentException("Negative text must not be set if device credential authentication is allowed.");
            }
        } else {
            throw new IllegalArgumentException("Title must be set and non-empty.");
        }
    }

    public kpa d() {
        return new kpa((Uri) this.a, (Uri) this.b, (jw3) this.c, (js4) this.o, (Uri) this.X, (Uri) this.Y);
    }

    public n6g e(n6g n6g) {
        return n6g.j(new gr(2), new hy5(4, this));
    }

    public dw0 f(String str) {
        return (dw0) ((HashMap) this.a).get(str);
    }

    public MenuItem g(int i) {
        Toolbar toolbar = (Toolbar) this.b;
        if (toolbar != null) {
            return toolbar.getMenu().findItem(i);
        }
        return null;
    }

    public dw0 h(String str) {
        HashMap hashMap = (HashMap) this.a;
        dw0 dw0 = (dw0) hashMap.get(str);
        if (dw0 != null) {
            return dw0;
        }
        SparseArray sparseArray = (SparseArray) this.b;
        int size = sparseArray.size();
        int i = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i < size && i == sparseArray.keyAt(i)) {
                i++;
            }
            keyAt = i;
        }
        dw0 dw02 = new dw0(keyAt, str, z54.c);
        hashMap.put(str, dw02);
        sparseArray.put(keyAt, str);
        ((SparseBooleanArray) this.o).put(keyAt, true);
        ((fw0) this.X).d(dw02);
        return dw02;
    }

    public void i(long j) {
        fw0 fw0;
        fw0 fw02 = (fw0) this.X;
        fw02.i(j);
        fw0 fw03 = (fw0) this.Y;
        if (fw03 != null) {
            fw03.i(j);
        }
        boolean f = fw02.f();
        SparseArray sparseArray = (SparseArray) this.b;
        HashMap hashMap = (HashMap) this.a;
        if (f || (fw0 = (fw0) this.Y) == null || !fw0.f()) {
            fw02.j(hashMap, sparseArray);
        } else {
            ((fw0) this.Y).j(hashMap, sparseArray);
            fw02.a(hashMap);
        }
        fw0 fw04 = (fw0) this.Y;
        if (fw04 != null) {
            fw04.k();
            this.Y = null;
        }
    }

    public void j(String str) {
        HashMap hashMap = (HashMap) this.a;
        dw0 dw0 = (dw0) hashMap.get(str);
        if (dw0 != null && dw0.c.isEmpty() && dw0.d.isEmpty()) {
            hashMap.remove(str);
            SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.o;
            int i = dw0.a;
            boolean z = sparseBooleanArray.get(i);
            ((fw0) this.X).b(dw0, z);
            SparseArray sparseArray = (SparseArray) this.b;
            if (z) {
                sparseArray.remove(i);
                sparseBooleanArray.delete(i);
                return;
            }
            sparseArray.put(i, (Object) null);
            ((SparseBooleanArray) this.c).put(i, true);
        }
    }

    public void k(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String str4;
        boolean g;
        int i2;
        PackageInfo packageInfo;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        ih5 ih5 = (ih5) this.a;
        ih5.a();
        bundle.putString("gmp_app_id", ih5.c.b);
        z29 z29 = (z29) this.b;
        synchronized (z29) {
            try {
                if (z29.a == 0) {
                    packageInfo = ((Context) z29.d).getPackageManager().getPackageInfo("com.google.android.gms", 0);
                    if (packageInfo != null) {
                        z29.a = packageInfo.versionCode;
                    }
                }
            } catch (PackageManager.NameNotFoundException e) {
                e.toString();
                packageInfo = null;
            } catch (Throwable th) {
                while (true) {
                    throw th;
                }
            }
            i = z29.a;
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", ((z29) this.b).g());
        z29 z292 = (z29) this.b;
        synchronized (z292) {
            try {
                if (((String) z292.e) == null) {
                    z292.j();
                }
                str3 = (String) z292.e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        bundle.putString("app_ver_name", str3);
        ih5 ih52 = (ih5) this.a;
        ih52.a();
        try {
            str4 = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(ih52.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            str4 = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", str4);
        try {
            String str5 = ((t90) gwf.a(((mh5) this.Y).d())).a;
            if (!TextUtils.isEmpty(str5)) {
                bundle.putString("Goog-Firebase-Installations-Auth", str5);
            }
        } catch (InterruptedException | ExecutionException unused2) {
        }
        bundle.putString("appid", (String) gwf.a(((mh5) this.Y).c()));
        bundle.putString("cliv", "fcm-24.0.1");
        z74 z74 = (if6) ((jib) this.X).get();
        dc4 dc4 = (dc4) ((jib) this.o).get();
        if (z74 != null && dc4 != null) {
            z74 z742 = z74;
            synchronized (z742) {
                long currentTimeMillis = System.currentTimeMillis();
                jf6 jf6 = (jf6) z742.a.get();
                synchronized (jf6) {
                    g = jf6.g(currentTimeMillis);
                }
                if (g) {
                    synchronized (jf6) {
                        String d = jf6.d(System.currentTimeMillis());
                        jf6.a.edit().putString("last-used-date", d).commit();
                        jf6.f(d);
                    }
                    i2 = 3;
                } else {
                    i2 = 1;
                }
            }
            if (i2 != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(hr1.t(i2)));
                bundle.putString("Firebase-Client", dc4.a());
            }
        }
    }

    public void l(String str) {
        TextView textView = (TextView) this.o;
        if (textView != null) {
            textView.setText(str);
        }
    }

    public void m() {
        im M = ((mn) this.a).M();
        Toolbar toolbar = (Toolbar) this.b;
        if (toolbar != null && M != null) {
            dn V = M.V();
            if (V.y0 instanceof Activity) {
                V.z();
                n1g n1g = V.D0;
                if (!(n1g instanceof trf)) {
                    V.E0 = null;
                    if (n1g != null) {
                        n1g.I();
                    }
                    V.D0 = null;
                    Object obj = V.y0;
                    wle wle = new wle(toolbar, obj instanceof Activity ? ((Activity) obj).getTitle() : V.F0, V.B0);
                    V.D0 = wle;
                    V.B0.b = wle.h;
                    toolbar.setBackInvokedCallbackEnabled(true);
                    V.a();
                    return;
                }
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
        }
    }

    public n6g n(String str, String str2, Bundle bundle) {
        int i;
        try {
            k(str, str2, bundle);
            zgc zgc = (zgc) this.c;
            hw9 hw9 = zgc.c;
            int g = hw9.g();
            mh4 mh4 = mh4.o;
            if (g < 12000000) {
                return hw9.h() != 0 ? zgc.a(bundle).k(mh4, new d4b(zgc, 18, bundle)) : gwf.n(new IOException("MISSING_INSTANCEID_SERVICE"));
            }
            i6g g2 = i6g.g(zgc.b);
            synchronized (g2) {
                i = g2.b;
                g2.b = i + 1;
            }
            return g2.h(new v5g(i, 1, bundle, 1)).j(mh4, bqc.A0);
        } catch (InterruptedException | ExecutionException e) {
            return gwf.n(e);
        }
    }

    public void o() {
        ((fw0) this.X).h((HashMap) this.a);
        SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) this.c;
        int size = sparseBooleanArray.size();
        for (int i = 0; i < size; i++) {
            ((SparseArray) this.b).remove(sparseBooleanArray.keyAt(i));
        }
        sparseBooleanArray.clear();
        ((SparseBooleanArray) this.o).clear();
    }

    public boolean onMenuItemClick(MenuItem menuItem) {
        return true;
    }

    public mif(ci9 ci9) {
        wce wce = (wce) ci9.c;
        mn mnVar = (mn) ci9.d;
        if (((WeakReference) mnVar.c).get() != null) {
            Context context = (Context) ((WeakReference) mnVar.c).get();
        } else {
            WeakReference weakReference = (WeakReference) mnVar.b;
            if (weakReference.get() != null) {
                ((a) weakReference.get()).e0();
            } else {
                throw new IllegalStateException("ContextWeakWrapper should have Activity or Fragment");
            }
        }
        zg4.b();
        this.a = mnVar;
        Toolbar toolbar = (Toolbar) ci9.e;
        this.b = toolbar;
        this.c = wce;
        if (toolbar != null) {
            toolbar.setVisibility(0);
        }
        toolbar.findViewById(yqb.toolbar);
        this.Y = toolbar.findViewById(yqb.toolbar__wrapper_title);
        TextView textView = (TextView) toolbar.findViewById(ci9.b);
        this.o = textView;
        if (textView != null) {
            new yge(textView, e07.a(textView.getContext())).a();
        }
        this.X = (TextView) toolbar.findViewById(yqb.toolbar_subtitle);
        TamAvatarView tamAvatarView = (TamAvatarView) toolbar.findViewById(yqb.toolbar_avatar);
        if (((TextView) this.o) != null) {
            toolbar.setContentInsetStartWithNavigation(0);
            TextView textView2 = (TextView) this.o;
            textView2.getContext();
            at7.g(textView2, zg4.a(8.0f));
            TextView textView3 = (TextView) this.X;
            if (textView3 != null) {
                ((TextView) this.o).getContext();
                at7.g(textView3, zg4.a(8.0f));
            }
        }
        wce wce2 = (wce) this.c;
        js.d(wce2, toolbar, (TextView) this.o, (TextView) this.X, wce2.F, wce2.M);
        toolbar.m(bsb.menu_empty);
        toolbar.setOnMenuItemClickListener(this);
        at7.i(toolbar, new f5(19, this));
    }
}
