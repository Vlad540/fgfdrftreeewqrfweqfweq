package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.NoWhenBranchMatchedException;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: ed1  reason: default package */
public final class ed1 extends jgd {
    public final raf X;
    public final Executor Y;
    public final dd1 Z;
    public final s16 w0;
    public final s16 x0;
    public final s16 y0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ed1(defpackage.raf r4, defpackage.dd1 r5, defpackage.s16 r6, defpackage.dk1 r7, defpackage.s51 r8, int r9) {
        /*
            r3 = this;
            nqc r0 = nqc.a
            x4a r0 = r0.p()
            java.util.concurrent.ExecutorService r0 = r0.a()
            r1 = r9 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0010
            r7 = r2
        L_0x0010:
            r9 = r9 & 32
            if (r9 == 0) goto L_0x0015
            r8 = r2
        L_0x0015:
            r3.<init>(r0)
            r3.X = r4
            r3.Y = r0
            r3.Z = r5
            r3.w0 = r6
            r3.x0 = r7
            r3.y0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ed1.<init>(raf, dd1, s16, dk1, s51, int):void");
    }

    /* renamed from: H */
    public final void r(chd chd, int i) {
        s(chd, i, hw4.a);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [ed1, ig7] */
    /* renamed from: J */
    public final void s(chd chd, int i, List list) {
        s16 s16;
        if ((chd instanceof cd1 ? (cd1) chd : null) != null) {
            if (this.X != raf.c) {
                ((cd1) chd).K0.setMode(qm1.b);
            } else if (j() == 1 && (s16 = this.y0) != null && ((Number) s16.invoke()).intValue() == 0) {
                ((cd1) chd).K0.setMode(qm1.X);
            } else {
                ((cd1) chd).K0.setMode(qm1.a);
            }
        }
        int K = K();
        View view = chd.a;
        if (!(view.getWidth() == K && view.getHeight() == K)) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = K;
                layoutParams.height = K;
                view.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        mu muVar = this.o;
        if (((v91) muVar.f.get(i)).l() != 1) {
            chd.A((pg7) muVar.f.get(i));
        } else if (list.isEmpty()) {
            chd.A((pg7) muVar.f.get(i));
        } else {
            cd1 cd1 = (cd1) chd;
            rg5 rg5 = new rg5(myc.L(new xi5(new es(2, list), new o8(28), oyc.a), x51.o));
            while (rg5.hasNext()) {
                r91 r91 = (r91) rg5.next();
                boolean z = r91 instanceof n91;
                sm1 sm1 = cd1.K0;
                if (z) {
                    n91 n91 = (n91) r91;
                    sm1.K(n91.b, n91.a);
                } else if (r91 instanceof o91) {
                    sm1.setRaiseHand(((o91) r91).a);
                } else if (r91 instanceof m91) {
                    sm1.G(((m91) r91).a);
                } else if (r91 instanceof p91) {
                    sm1.I(((p91) r91).a);
                } else if (r91 instanceof k91) {
                    sm1.setAvatar(((k91) r91).a);
                } else if (r91 instanceof l91) {
                    sm1.setButtonAction(((l91) r91).a);
                } else if (r91 instanceof q91) {
                    sm1.setOpponentVideo(((q91) r91).a);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    public final int K() {
        int ordinal = this.X.ordinal();
        if (ordinal == 0) {
            return a24.X(((float) 96) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 1) {
            return a24.X(((float) 0) * dh4.c().getDisplayMetrics().density);
        }
        if (ordinal == 2) {
            return -1;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [ed1, ig7] */
    public final int l(int i) {
        return ((v91) this.o.f.get(i)).l();
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [bd1, b7c] */
    /* JADX WARNING: type inference failed for: r0v3, types: [androidx.constraintlayout.widget.ConstraintLayout, rj1, android.view.View, android.view.ViewGroup] */
    /* JADX WARNING: type inference failed for: r0v4, types: [bd1, b7c] */
    /* JADX WARNING: type inference failed for: r0v6, types: [rx0, b7c] */
    /* JADX WARNING: type inference failed for: r0v8, types: [cd1, b7c] */
    public final b7c t(ViewGroup viewGroup, int i) {
        int i2 = i;
        int K = K();
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(K, K));
        qda qda = qda.a;
        dd1 dd1 = this.Z;
        if (i2 == 2) {
            Context context = viewGroup.getContext();
            LinearLayout linearLayout = new LinearLayout(context, (AttributeSet) null);
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-14803164);
            kjd.J(linearLayout, dh4.c().getDisplayMetrics().density * 20.0f);
            float f = (float) 28;
            float f2 = (float) 16;
            linearLayout.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f2));
            AppCompatImageView appCompatImageView = new AppCompatImageView(context, (AttributeSet) null);
            appCompatImageView.setId(View.generateViewId());
            linearLayout.setGravity(17);
            appCompatImageView.setImageResource(cnb.ic_invite_opponents_43);
            appCompatImageView.setImageTintList(ColorStateList.valueOf(-855638017));
            AppCompatTextView appCompatTextView = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            float f3 = (float) 0;
            float f4 = (float) 4;
            layoutParams.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f4));
            appCompatTextView.setLayoutParams(layoutParams);
            appCompatTextView.setGravity(17);
            nge.d(nte.j, appCompatTextView);
            appCompatTextView.setTextColor(-855638017);
            appCompatTextView.setText(ftb.call_item_invite_opponent_preview_title);
            AppCompatTextView appCompatTextView2 = new AppCompatTextView(context, (AttributeSet) null);
            appCompatTextView2.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(f4 * dh4.c().getDisplayMetrics().density), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f2));
            appCompatTextView2.setLayoutParams(layoutParams2);
            appCompatTextView2.setGravity(17);
            nge.d(nte.m, appCompatTextView2);
            appCompatTextView2.setTextColor(1895825407);
            appCompatTextView2.setText(ftb.call_item_invite_opponent_preview_description);
            OneMeButton oneMeButton = new OneMeButton(context, (AttributeSet) null);
            oneMeButton.setId(View.generateViewId());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams3.setMargins(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(((float) 8) * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(f2 * dh4.c().getDisplayMetrics().density));
            oneMeButton.setLayoutParams(layoutParams3);
            oneMeButton.setMode(u0a.b);
            oneMeButton.setSize(v0a.b);
            oneMeButton.setAppearance(s0a.a);
            oneMeButton.setText(ftb.call_item_invite_opponent_preview_button_share);
            a24.Z(oneMeButton, 300, new d5(10, linearLayout));
            oneMeButton.setCustomTheme(qda);
            float f5 = (float) 38;
            linearLayout.addView(appCompatImageView, a24.X(dh4.c().getDisplayMetrics().density * f5), a24.X(f5 * dh4.c().getDisplayMetrics().density));
            linearLayout.addView(appCompatTextView);
            linearLayout.addView(appCompatTextView2);
            linearLayout.addView(oneMeButton);
            linearLayout.setId(uob.call_invite_opponent_preview);
            linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(linearLayout);
            return new bd1(frameLayout, (i91) dd1);
        } else if (i2 == 3) {
            Context context2 = viewGroup.getContext();
            ? constraintLayout = new ConstraintLayout(context2, (AttributeSet) null);
            constraintLayout.setBackgroundColor(-14342611);
            kjd.J(constraintLayout, dh4.c().getDisplayMetrics().density * 20.0f);
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(context2, (AttributeSet) null);
            appCompatTextView3.setId(o1a.X);
            appCompatTextView3.setLayoutParams(new re3(-1, -2));
            appCompatTextView3.setGravity(17);
            nge.d(nte.b, appCompatTextView3);
            appCompatTextView3.setTextColor(-855638017);
            appCompatTextView3.setText(ftb.call_item_join_by_link_preview_title);
            dgc dgc = new dgc(context2, (AttributeSet) null);
            dgc.setId(o1a.T);
            dgc.y(n1a.D, -1);
            dgc.setAccessibility(Integer.valueOf(r1a.F));
            dgc.setMode(yfc.X);
            float f6 = (float) 32;
            dgc.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f6), a24.X(f6 * dh4.c().getDisplayMetrics().density)));
            dgc.setButtonPadding(a24.X(((float) 3) * dh4.c().getDisplayMetrics().density));
            a24.Z(dgc, 300, new pj1(constraintLayout, 0));
            dgc dgc2 = new dgc(context2, (AttributeSet) null);
            dgc2.setId(o1a.U);
            yfc yfc = yfc.a;
            dgc2.setMode(yfc);
            float f7 = (float) 56;
            dgc2.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f7), a24.X(dh4.c().getDisplayMetrics().density * f7)));
            float f8 = (float) 6;
            dgc2.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f8));
            dgc2.y(n1a.G, -855638017);
            int i3 = r1a.T;
            dgc2.setTitle(new hge(i3));
            dgc2.setAccessibility(Integer.valueOf(i3));
            a24.Z(dgc2, 300, new pj1(constraintLayout, 1));
            dgc dgc3 = new dgc(context2, (AttributeSet) null);
            dgc3.setId(o1a.W);
            dgc3.setMode(yfc);
            dgc3.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f7), a24.X(dh4.c().getDisplayMetrics().density * f7)));
            dgc3.setButtonPadding(a24.X(dh4.c().getDisplayMetrics().density * f8));
            dgc3.y(n1a.o0, -855638017);
            int i4 = r1a.V;
            dgc3.setTitle(new hge(i4));
            dgc3.setAccessibility(Integer.valueOf(i4));
            a24.Z(dgc3, 300, new pj1(constraintLayout, 2));
            dgc dgc4 = new dgc(context2, (AttributeSet) null);
            dgc4.setId(o1a.V);
            dgc4.setMode(yfc);
            dgc4.setImageSize(new zfc(a24.X(dh4.c().getDisplayMetrics().density * f7), a24.X(f7 * dh4.c().getDisplayMetrics().density)));
            dgc4.setButtonPadding(a24.X(f8 * dh4.c().getDisplayMetrics().density));
            dgc4.y(n1a.m0, -855638017);
            int i5 = r1a.U;
            dgc4.setTitle(new hge(i5));
            dgc4.setAccessibility(Integer.valueOf(i5));
            a24.Z(dgc4, 300, new pj1(constraintLayout, 3));
            constraintLayout.addView(appCompatTextView3);
            constraintLayout.addView(dgc);
            constraintLayout.addView(dgc2);
            constraintLayout.addView(dgc3);
            constraintLayout.addView(dgc4);
            bf3 p = a06.p(constraintLayout);
            int id = dgc.getId();
            p.d(id, 3, 0, 3);
            float f9 = (float) 12;
            hr1.q(f9, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
            p.d(id, 7, 0, 7);
            new hw9(p, 7, id, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f9));
            int id2 = appCompatTextView3.getId();
            p.d(id2, 3, dgc.getId(), 4);
            p.d(id2, 7, 0, 7);
            hr1.q(f9, dh4.c().getDisplayMetrics().density, new hw9(p, 7, id2, 4));
            p.d(id2, 6, 0, 6);
            new hw9(p, 6, id2, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f9));
            int id3 = dgc2.getId();
            p.d(id3, 3, appCompatTextView3.getId(), 4);
            hr1.q((float) 4, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
            p.d(id3, 6, 0, 6);
            new hw9(p, 6, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f9));
            p.d(id3, 7, dgc4.getId(), 6);
            p.d(id3, 4, 0, 4);
            new hw9(p, 4, id3, 4).e(a24.X(dh4.c().getDisplayMetrics().density * f9));
            int id4 = dgc4.getId();
            p.d(id4, 3, dgc2.getId(), 3);
            p.d(id4, 6, dgc2.getId(), 7);
            p.d(id4, 7, dgc3.getId(), 6);
            p.d(id4, 4, dgc2.getId(), 4);
            int id5 = dgc3.getId();
            p.d(id5, 3, dgc4.getId(), 3);
            p.d(id5, 6, dgc4.getId(), 7);
            p.d(id5, 7, 0, 7);
            new hw9(p, 7, id5, 4).e(a24.X(f9 * dh4.c().getDisplayMetrics().density));
            p.d(id5, 4, dgc4.getId(), 4);
            p.a(constraintLayout);
            constraintLayout.setId(uob.call_copy_link_preview);
            constraintLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(constraintLayout);
            return new bd1(frameLayout, (qj1) dd1);
        } else if (i2 != 4) {
            sm1 sm1 = new sm1(viewGroup.getContext(), (AttributeSet) null);
            sm1.setId(uob.call_opponent);
            int ordinal = this.X.ordinal();
            qm1 qm1 = qm1.b;
            if (!(ordinal == 0 || ordinal == 1)) {
                if (ordinal == 2) {
                    qm1 = qm1.a;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            sm1.setMode(qm1);
            sm1.setCustomTheme(qda);
            sm1.setCallSpeakerMediator(this.x0);
            sm1.setVideoLayoutUpdatesControllerProvider(this.w0);
            frameLayout.addView(sm1, -1, -1);
            return new cd1(frameLayout, dd1);
        } else {
            in1 in1 = new in1(viewGroup.getContext());
            in1.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            frameLayout.addView(in1);
            return new rx0(frameLayout, 4);
        }
    }
}
