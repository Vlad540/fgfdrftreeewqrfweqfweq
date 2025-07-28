package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableString;
import android.view.View;
import android.widget.TextView;
import java.lang.Thread;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.messages.list.loader.MessageModel;
import ru.ok.android.externcalls.sdk.Conversation;

/* renamed from: to1  reason: default package */
public final /* synthetic */ class to1 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object o;

    public /* synthetic */ to1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.o = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARNING: type inference failed for: r0v57, types: [zye, b7c] */
    public final Object invoke(Object obj) {
        SpannableString spannableString;
        String str = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                Conversation conversation = (Conversation) obj;
                s16 s16 = ((gpd) this.o).d;
                if (s16 != null) {
                    s16.invoke();
                }
                k21 k21 = (k21) ((l7c) this.b).a;
                if (k21 != null) {
                    ((ep1) this.c).g(k21);
                }
                return jue.a;
            case 1:
                udd.p("CallEngineTag", ((ou3) this.o) + " conversation for answer is created " + ((Conversation) obj).getConversationId(), new Object[0]);
                k21 k212 = (k21) ((l7c) this.b).a;
                if (k212 != null) {
                    k77[] k77Arr = ep1.K;
                    ((ep1) this.c).g(k212);
                }
                return jue.a;
            case 2:
                View view = (View) obj;
                i22 i22 = (i22) this.o;
                boolean H = i22.H();
                nn2 nn2 = (nn2) this.b;
                if (H) {
                    o62 o62 = i22.b;
                    n00 n00 = o62 == null ? null : o62.T;
                    if (n00 != null) {
                        str = n00.c;
                    }
                    taf.o(nn2.c1, new em2(1, 0, o62.a, str));
                } else {
                    l05 l05 = nn2.c1;
                    Long l = (Long) this.c;
                    taf.o(l05, new em2(6, l != null ? l.longValue() : 0, 0, (String) null));
                }
                return jue.a;
            case 3:
                ((c23) this.o).Y0.invoke(new tv8((w13) this.b, ((MessageModel) this.c).a, (String) obj));
                return jue.a;
            case 4:
                ((c23) this.o).Y0.invoke(new tv8((w13) this.b, ((MessageModel) this.c).a, (String) obj));
                return jue.a;
            case 5:
                q1b h = ((w6a) this.o).h((String) obj);
                return new q1b(udd.G(km4.y0.n((Context) this.c).g(), h, udd.z(h.a.toString(), ((yib) this.b).b)), h.b);
            case 6:
                jg8 jg8 = (jg8) this.o;
                gg8 gg8 = (gg8) this.b;
                j93 j93 = (j93) this.c;
                bf4 bf4 = (bf4) obj;
                String str2 = (String) jg8.b;
                fn6 fn6 = udd.e;
                if (fn6 != null && fn6.c()) {
                    fn6.d(tn7.X, str2, "executeWithDetachableLooper", (Throwable) null);
                }
                String str3 = ((yf8) jg8.c).c;
                kqe p = jg8.p(jg8.n(gg8), new ig8(gg8, jg8, bf4, 0));
                r7e r7e = bf4.c;
                Handler handler = new Handler(bf4.b, (Handler.Callback) null);
                ((yf8) jg8.c).getClass();
                ((yf8) jg8.c).getClass();
                bg8 bg8 = new bg8(handler, p, 500, 300000, ((yf8) jg8.c).l);
                try {
                    p.e(j93, str3);
                    bg8.b();
                    String str4 = (String) jg8.b;
                    fn6 fn62 = udd.e;
                    if (fn62 != null) {
                        if (fn62.c()) {
                            fn62.d(tn7.X, str4, "executeWithDetachableLooper, starting loop ...", (Throwable) null);
                        }
                    }
                    if (hhd.f(bf4.b.getThread(), Thread.currentThread())) {
                        Looper.loop();
                        String str5 = (String) jg8.b;
                        fn6 fn63 = udd.e;
                        if (fn63 != null) {
                            if (fn63.c()) {
                                fn63.d(tn7.X, str5, "executeWithDetachableLooper, loop completed", (Throwable) null);
                            }
                        }
                        jg8.j(p);
                        bg8.a();
                        return jue.a;
                    }
                    throw new IllegalStateException("Illegal thread".toString());
                } catch (Throwable th) {
                    jg8.j(p);
                    bg8.a();
                    throw th;
                }
            case 7:
                tf3 tf3 = (tf3) obj;
                if (!tf3.w() && !((List) this.o).contains(tf3) && tf3.n() != ((cl8) ((l7c) this.b).a).Y.s() && tf3.n() == ((vo8) this.c).Y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                vt7 vt7 = (vt7) obj;
                vt7.a = (i22) this.o;
                vt7.c = (vo8) this.b;
                vt7.e = (o1b) this.c;
                return jue.a;
            case 9:
                String str6 = (String) obj;
                TextView textView = (TextView) this.o;
                String str7 = (String) this.b;
                if (textView != null) {
                    nqc nqc = nqc.a;
                    List<String> e = nqc.r().e(str6, str7);
                    String e2 = ehe.e(str6);
                    if (!(e2 == null || e2.length() == 0 || textView.getPaint().measureText(e2) <= ((float) textView.getMeasuredWidth()))) {
                        String[] l2 = nqc.r().l(e2);
                        if (!r1g.p(e2) && !ek8.J(e) && l2 != null && l2.length != 0) {
                            int i = 0;
                            while (true) {
                                if (i < l2.length) {
                                    for (String str8 : e) {
                                        if (!r1g.p(str8) && l2[i].regionMatches(true, 0, str8, 0, str8.length())) {
                                            int indexOf = e2.indexOf(l2[i]);
                                            if (i != 0 && indexOf > 10) {
                                                e2 = "…" + e2.substring(Math.max(0, indexOf - 10));
                                            }
                                        }
                                    }
                                    i++;
                                }
                            }
                        }
                    }
                    spannableString = udd.F(e2, nqc.a.r().d(e2.toString(), e), km4.y0.r(textView));
                } else {
                    String e3 = ehe.e(str6);
                    nqc nqc2 = nqc.a;
                    spannableString = udd.F(e3, nqc2.r().d(e3.toString(), nqc2.r().e(e3, str7)), (pda) this.c);
                }
                return nqc.a.o().j.e(spannableString);
            case 10:
                String str9 = (String) obj;
                Integer num = (Integer) this.c;
                int intValue = num != null ? num.intValue() : 5;
                duf duf = (duf) this.b;
                return new tda((String) this.o, (Thread.UncaughtExceptionHandler) duf.a, intValue, (eie) ((s16) duf.b).invoke());
            case 11:
                Long l3 = (Long) obj;
                return ((p1b) ((n1b) this.o).b.getValue()).a((i22) this.c, (vo8) this.b);
            case 12:
                udc udc = (udc) this.o;
                udc.getClass();
                return udc.f(udc, (List) this.b, (Set) this.c, (Continuation) obj);
            case 13:
                ValueAnimator valueAnimator = (ValueAnimator) obj;
                View view2 = (View) this.o;
                float translationY = ((float) 1) - (view2.getTranslationY() / (dh4.c().getDisplayMetrics().density * 4.0f));
                float translationY2 = view2.getTranslationY() == 0.0f ? dh4.c().getDisplayMetrics().density * 4.0f : view2.getTranslationY();
                float animatedFraction = valueAnimator != null ? valueAnimator.getAnimatedFraction() : 0.0f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{translationY2, 0.0f});
                ofFloat.setDuration((long) (((float) 200) * translationY));
                ofFloat.setInterpolator(zoc.B0);
                ofFloat.addListener(new d50((zoc) this.b, (toc) this.c, view2, 1));
                ofFloat.addUpdateListener(new gfc(view2, animatedFraction, 1));
                ofFloat.start();
                return ofFloat;
            default:
                ((k26) this.o).invoke((View) obj, (xye) this.b, Integer.valueOf(((zye) this.c).h()));
                return jue.a;
        }
    }

    public /* synthetic */ to1(String str, pda pda) {
        this.a = 9;
        this.o = null;
        this.b = str;
        this.c = pda;
    }
}
