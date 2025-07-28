package androidx.loader.app;

import android.os.Looper;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.Set;

public final class b {
    public final nc7 a;
    public final LoaderManagerImpl$LoaderViewModel b;

    public b(nc7 nc7, bbf bbf) {
        this.a = nc7;
        this.b = (LoaderManagerImpl$LoaderViewModel) new fzd(bbf, (zaf) LoaderManagerImpl$LoaderViewModel.d).a(m7c.a(LoaderManagerImpl$LoaderViewModel.class));
    }

    public final void a(String str, PrintWriter printWriter) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.b.c > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            String str2 = str + "    ";
            int i = 0;
            while (true) {
                fmd fmd = loaderManagerImpl$LoaderViewModel.b;
                if (i < fmd.c) {
                    mj7 mj7 = (mj7) fmd.b[i];
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(loaderManagerImpl$LoaderViewModel.b.a[i]);
                    printWriter.print(": ");
                    printWriter.println(mj7.toString());
                    printWriter.print(str2);
                    printWriter.print("mId=");
                    printWriter.print(mj7.l);
                    printWriter.print(" mArgs=");
                    printWriter.println(mj7.m);
                    printWriter.print(str2);
                    printWriter.print("mLoader=");
                    printWriter.println(mj7.n);
                    l2g l2g = mj7.n;
                    String g = hr1.g(str2, "  ");
                    l2g.getClass();
                    printWriter.print(g);
                    printWriter.print("mId=");
                    printWriter.print(l2g.a);
                    printWriter.print(" mListener=");
                    printWriter.println(l2g.b);
                    if (l2g.c || l2g.f) {
                        printWriter.print(g);
                        printWriter.print("mStarted=");
                        printWriter.print(l2g.c);
                        printWriter.print(" mContentChanged=");
                        printWriter.print(l2g.f);
                        printWriter.print(" mProcessingChange=");
                        printWriter.println(false);
                    }
                    if (l2g.d || l2g.e) {
                        printWriter.print(g);
                        printWriter.print("mAbandoned=");
                        printWriter.print(l2g.d);
                        printWriter.print(" mReset=");
                        printWriter.println(l2g.e);
                    }
                    if (l2g.h != null) {
                        printWriter.print(g);
                        printWriter.print("mTask=");
                        printWriter.print(l2g.h);
                        printWriter.print(" waiting=");
                        l2g.h.getClass();
                        printWriter.println(false);
                    }
                    if (l2g.i != null) {
                        printWriter.print(g);
                        printWriter.print("mCancellingTask=");
                        printWriter.print(l2g.i);
                        printWriter.print(" waiting=");
                        l2g.i.getClass();
                        printWriter.println(false);
                    }
                    if (mj7.p != null) {
                        printWriter.print(str2);
                        printWriter.print("mCallbacks=");
                        printWriter.println(mj7.p);
                        nj7 nj7 = mj7.p;
                        nj7.getClass();
                        printWriter.print(str2 + "  ");
                        printWriter.print("mDeliveredData=");
                        printWriter.println(nj7.b);
                    }
                    printWriter.print(str2);
                    printWriter.print("mData=");
                    l2g l2g2 = mj7.n;
                    Object d = mj7.d();
                    l2g2.getClass();
                    StringBuilder sb = new StringBuilder(64);
                    xy6.e(sb, d);
                    sb.append("}");
                    printWriter.println(sb.toString());
                    printWriter.print(str2);
                    printWriter.print("mStarted=");
                    printWriter.println(mj7.c > 0);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final l2g b(u5g u5g) {
        LoaderManagerImpl$LoaderViewModel loaderManagerImpl$LoaderViewModel = this.b;
        if (loaderManagerImpl$LoaderViewModel.c) {
            throw new IllegalStateException("Called while creating a loader");
        } else if (Looper.getMainLooper() == Looper.myLooper()) {
            mj7 mj7 = (mj7) loaderManagerImpl$LoaderViewModel.b.c(0);
            nc7 nc7 = this.a;
            if (mj7 == null) {
                Class<l2g> cls = l2g.class;
                try {
                    loaderManagerImpl$LoaderViewModel.c = true;
                    SignInHubActivity signInHubActivity = (SignInHubActivity) u5g.b;
                    Set set = fzf.b;
                    synchronized (set) {
                    }
                    l2g l2g = new l2g(signInHubActivity, set);
                    if (cls.isMemberClass()) {
                        if (!Modifier.isStatic(cls.getModifiers())) {
                            throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + l2g);
                        }
                    }
                    mj7 mj72 = new mj7(l2g);
                    loaderManagerImpl$LoaderViewModel.b.d(0, mj72);
                    loaderManagerImpl$LoaderViewModel.c = false;
                    l2g l2g2 = mj72.n;
                    nj7 nj7 = new nj7(l2g2, u5g);
                    mj72.e(nc7, nj7);
                    nj7 nj72 = mj72.p;
                    if (nj72 != null) {
                        mj72.j(nj72);
                    }
                    mj72.o = nc7;
                    mj72.p = nj7;
                    return l2g2;
                } catch (Throwable th) {
                    loaderManagerImpl$LoaderViewModel.c = false;
                    throw th;
                }
            } else {
                l2g l2g3 = mj7.n;
                nj7 nj73 = new nj7(l2g3, u5g);
                mj7.e(nc7, nj73);
                nj7 nj74 = mj7.p;
                if (nj74 != null) {
                    mj7.j(nj74);
                }
                mj7.o = nc7;
                mj7.p = nj73;
                return l2g3;
            }
        } else {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
    }

    public final void c() {
        fmd fmd = this.b.b;
        int i = fmd.c;
        for (int i2 = 0; i2 < i; i2++) {
            ((mj7) fmd.b[i2]).l();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        xy6.e(sb, this.a);
        sb.append("}}");
        return sb.toString();
    }
}
