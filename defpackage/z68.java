package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.keyboardmedia.MediaKeyboardWidget;

/* renamed from: z68  reason: default package */
public final class z68 {
    public static final /* synthetic */ k77[] m;
    public final sgc a;
    public final View b;
    public final View c;
    public final s16 d;
    public final boolean e;
    public final yb7 f;
    public boolean g;
    public final s16 h;
    public AnimatorSet i;
    public final e3 j = hwf.t();
    public final int k = a24.X(((float) 100) * dh4.c().getDisplayMetrics().density);
    public boolean l;

    static {
        hc9 hc9 = new hc9(z68.class, "keyboardObserverJob", "getKeyboardObserverJob()Lkotlinx/coroutines/Job;");
        m7c.a.getClass();
        m = new k77[]{hc9};
    }

    public z68(sgc sgc, az1 az1, View view, s16 s16, boolean z, yb7 yb7, boolean z2, s16 s162) {
        this.a = sgc;
        this.b = az1;
        this.c = view;
        this.d = s16;
        this.e = z;
        this.f = yb7;
        this.g = z2;
        this.h = s162;
    }

    public final void a() {
        k77[] k77Arr = m;
        k77 k77 = k77Arr[0];
        e3 e3Var = this.j;
        g37 g37 = (g37) e3Var.T0(this, k77);
        if (g37 != null) {
            g37.cancel((CancellationException) null);
        }
        e3Var.o1(this, k77Arr[0], (Object) null);
        sgc sgc = this.a;
        if (sgc.n()) {
            sgc.C();
        }
    }

    public final ValueAnimator b(int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.c.getPaddingBottom(), i2});
        ofInt.addUpdateListener(new w68(this, 0));
        return ofInt;
    }

    public final int c() {
        int i2 = e87.a;
        return e87.a(this.b.getContext());
    }

    public final MediaKeyboardWidget d() {
        vgc vgc = (vgc) o23.X(this.a.e());
        rr3 rr3 = vgc != null ? vgc.a : null;
        if (rr3 instanceof MediaKeyboardWidget) {
            return (MediaKeyboardWidget) rr3;
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r10v3, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: type inference failed for: r10v8, types: [android.view.ViewGroup$LayoutParams] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(boolean r10) {
        /*
            r9 = this;
            r0 = 2
            r1 = 1
            r2 = 0
            sgc r3 = r9.a
            boolean r3 = r3.n()
            if (r3 != 0) goto L_0x000c
            return
        L_0x000c:
            boolean r3 = r9.e
            r4 = 0
            android.view.View r5 = r9.b
            if (r3 == 0) goto L_0x0070
            android.util.Property r3 = android.view.View.TRANSLATION_Y
            float r6 = r5.getTranslationY()
            int r7 = r5.getHeight()
            float r7 = (float) r7
            float[] r8 = new float[r0]
            r8[r2] = r6
            r8[r1] = r7
            android.animation.ObjectAnimator r3 = android.animation.ObjectAnimator.ofFloat(r5, r3, r8)
            android.animation.AnimatorSet r6 = r9.i
            if (r6 == 0) goto L_0x002f
            r6.cancel()
        L_0x002f:
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            if (r10 == 0) goto L_0x0055
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            boolean r5 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r5 == 0) goto L_0x0041
            r4 = r10
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0041:
            if (r4 == 0) goto L_0x0046
            int r10 = r4.bottomMargin
            goto L_0x0047
        L_0x0046:
            r10 = r2
        L_0x0047:
            android.animation.ValueAnimator r10 = r9.b(r10)
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            r0[r2] = r10
            r0[r1] = r3
            r6.playTogether(r0)
            goto L_0x0058
        L_0x0055:
            r6.play(r3)
        L_0x0058:
            r3 = 200(0xc8, double:9.9E-322)
            r6.setDuration(r3)
            v68 r10 = new v68
            r10.<init>(r9, r1)
            fh r0 = new fh
            r0.<init>(r6, r10, r2)
            r6.addListener(r0)
            r6.start()
            r9.i = r6
            goto L_0x009f
        L_0x0070:
            int r10 = r5.getHeight()
            float r10 = (float) r10
            r5.setTranslationY(r10)
            android.view.ViewGroup$LayoutParams r10 = r5.getLayoutParams()
            boolean r0 = r10 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r0 == 0) goto L_0x0083
            r4 = r10
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
        L_0x0083:
            if (r4 == 0) goto L_0x0088
            int r10 = r4.bottomMargin
            goto L_0x0089
        L_0x0088:
            r10 = r2
        L_0x0089:
            android.view.View r0 = r9.c
            int r1 = r0.getPaddingLeft()
            int r3 = r0.getPaddingTop()
            int r4 = r0.getPaddingRight()
            r0.setPadding(r1, r3, r4, r10)
            r9.l = r2
            r9.a()
        L_0x009f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z68.e(boolean):void");
    }

    public final void f() {
        boolean z = true;
        this.l = true;
        boolean z2 = this.e;
        View view = this.c;
        View view2 = this.b;
        if (z2) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{view2.getTranslationY(), 0.0f});
            int c2 = c();
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            int i2 = c2 + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0);
            boolean z3 = view.getPaddingBottom() != i2;
            AnimatorSet animatorSet = this.i;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            if (z3) {
                animatorSet2.playTogether(new Animator[]{b(i2), ofFloat});
            } else {
                animatorSet2.play(ofFloat);
            }
            animatorSet2.setDuration(200);
            animatorSet2.addListener(new fh(animatorSet2, new v68(this, 0), 1));
            animatorSet2.start();
            this.i = animatorSet2;
        } else {
            int i3 = e87.a;
            boolean b2 = e87.b(e87.c);
            d87 d87 = (d87) this.d.invoke();
            if (d87 != null) {
                d87.m();
            }
            if (b2) {
                eaf.l(view, new ff(view, this));
            } else {
                int c3 = c();
                ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
                int i4 = c3 + (marginLayoutParams2 != null ? marginLayoutParams2.bottomMargin : 0);
                if (view.getPaddingBottom() == i4) {
                    z = false;
                }
                view2.setTranslationY(0.0f);
                if (z) {
                    view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i4);
                }
            }
        }
        grd grd = e87.f;
        nl5 ik5 = new ik5(grd, 24);
        if (((Boolean) grd.getValue()).booleanValue()) {
            ik5 = new nl5(ik5, 0);
        }
        this.j.o1(this, m[0], e07.B(new ck5(ik5, new y68(this, (Continuation) null), 5), this.f));
    }
}
