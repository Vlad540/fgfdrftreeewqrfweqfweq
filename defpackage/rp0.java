package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.profile.ProfileScreen;

/* renamed from: rp0  reason: default package */
public final /* synthetic */ class rp0 implements k26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rp0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        Object obj4;
        switch (this.a) {
            case 0:
                ImageView imageView = (ImageView) obj;
                ((Boolean) obj2).getClass();
                pda pda = (pda) obj3;
                int t = hr1.t(((sp0) this.b).N0);
                if (t == 0) {
                    pda.getIcon().a.a.getClass();
                    i = -16745729;
                } else if (t == 1) {
                    i = pda.getIcon().a.a.a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                imageView.setImageTintList(ColorStateList.valueOf(i));
                return jue.a;
            case 1:
                return new ns0(obj3, (us0) this.b, (zvc) obj);
            case 2:
                hu3 hu3 = (hu3) obj3;
                ((u16) this.b).invoke((Throwable) obj);
                return jue.a;
            case 3:
                long longValue = ((Long) obj).longValue();
                ryb ryb = (ryb) obj2;
                View view = (View) obj3;
                vzb vzb = ((MessagesListWidget) this.b).a1;
                if (vzb != null) {
                    Iterator it = vzb.e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj4 = it.next();
                            szb szb = (szb) obj4;
                            if (szb.a != longValue || !hhd.f(szb.c, ryb)) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    szb szb2 = (szb) obj4;
                    if (szb2 == null) {
                        String str = vzb.d;
                        fn6 fn6 = udd.e;
                        if (fn6 != null && fn6.c()) {
                            fn6.d(tn7.X, str, "Can't play reaction effect because don't have state, reaction:" + ryb + ", l:" + longValue, (Throwable) null);
                        }
                    } else {
                        b7c N = vzb.a.N(szb2.a);
                        if (vzb.f(N != null ? N.h() : -1)) {
                            String str2 = vzb.d;
                            fn6 fn62 = udd.e;
                            if (fn62 != null && fn62.c()) {
                                fn62.d(tn7.X, str2, "Make reaction effect pending, reaction:" + ryb + ", msgId:" + longValue, (Throwable) null);
                            }
                            vzb.f.add(Long.valueOf(szb2.a));
                        } else {
                            vzb.f.remove(Long.valueOf(szb2.a));
                            vzb.e.remove(szb2);
                            View view2 = N.a;
                            afa.a(view2, new zme(view2, vzb, view, szb2, ryb, longValue));
                        }
                    }
                }
                return jue.a;
            case 4:
                View view3 = (View) obj;
                nsf nsf = (nsf) obj2;
                Rect rect = (Rect) obj3;
                k77[] k77Arr = ProfileScreen.H0;
                ProfileScreen profileScreen = (ProfileScreen) this.b;
                profileScreen.getClass();
                fm fmVar = (fm) profileScreen.X.T0(profileScreen, ProfileScreen.H0[0]);
                fmVar.setPadding(fmVar.getPaddingLeft(), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), fmVar.getPaddingRight(), fmVar.getPaddingBottom());
                return nsf;
            default:
                Throwable th = (Throwable) obj;
                jue jue = (jue) obj2;
                hu3 hu32 = (hu3) obj3;
                ((gxc) this.b).c();
                return jue.a;
        }
    }
}
