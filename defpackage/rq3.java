package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import one.me.sdk.uikit.common.button.OneMeButton;

/* renamed from: rq3  reason: default package */
public final class rq3 extends chd {
    public final /* synthetic */ int J0 = 3;
    public final Object K0;
    public final Object L0;
    public Object M0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rq3(android.content.Context r4, defpackage.er7 r5, java.util.concurrent.ExecutorService r6, defpackage.fwd r7) {
        /*
            r3 = this;
            r0 = 2
            r3.J0 = r0
            ewd r0 = new ewd
            r0.<init>(r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r1 = -1
            r2 = -2
            r4.<init>(r1, r2)
            r0.setLayoutParams(r4)
            r3.<init>(r0)
            r3.K0 = r0
            cpf r4 = new cpf
            nfc r1 = new nfc
            r2 = 28
            r1.<init>(r2, r7)
            r4.<init>(r6, r1)
            r3.L0 = r4
            nya r6 = new nya
            r1 = 22
            r6.<init>(r3, r1, r7)
            r0.setHeaderClickAction(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r0.b
            if (r5 == 0) goto L_0x003c
            i87 r6 = new i87
            r7 = 5
            r6.<init>(r7, r5)
            r3.k(r6)
        L_0x003c:
            r3.setAdapter(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.<init>(android.content.Context, er7, java.util.concurrent.ExecutorService, fwd):void");
    }

    public final void A(pg7 pg7) {
        switch (this.J0) {
            case 0:
                if (pg7 instanceof qq3) {
                    ViewGroup viewGroup = (ViewGroup) this.M0;
                    if (viewGroup.getChildCount() <= 0) {
                        Context context = this.a.getContext();
                        Collection collection = ((qq3) pg7).a;
                        ((smc) this.K0).getClass();
                        viewGroup.addView(smc.h(context, collection, (u16) this.L0));
                        return;
                    }
                    return;
                }
                return;
            case 1:
                if (pg7 instanceof di8) {
                    di8 di8 = (di8) pg7;
                    this.M0 = di8;
                    long j = di8.a;
                    String str = di8.o;
                    kh3 kh3 = (kh3) this.K0;
                    CharSequence charSequence = di8.b;
                    kh3.O(j, charSequence, str);
                    kh3.setName(charSequence);
                    ryb ryb = di8.w0;
                    ((TextView) this.L0).setText(ryb != null ? ryb.a : null);
                    return;
                }
                return;
            case 2:
                if (pg7 instanceof hud) {
                    hud hud = (hud) pg7;
                    this.M0 = hud;
                    List list = hud.X;
                    int size = list.size();
                    ewd ewd = (ewd) this.K0;
                    String format = String.format(ewd.getContext().getResources().getQuantityString(haa.a, size), Arrays.copyOf(new Object[]{Integer.valueOf(size)}, 1));
                    CharSequence a = hud.b.a(ewd.getContext());
                    if (a == null) {
                        a = "";
                    }
                    boolean z = hud.w0;
                    int i = z ? iaa.b : iaa.a;
                    u0a u0a = z ? u0a.b : u0a.a;
                    gwd gwd = ewd.a;
                    gwd.a.setText(a);
                    gwd.b.setText(format);
                    OneMeButton oneMeButton = gwd.c;
                    oneMeButton.setText(i);
                    oneMeButton.setMode(u0a);
                    oneMeButton.setVisibility(0);
                    ((cpf) this.L0).E(list);
                    return;
                }
                return;
            default:
                g25 g25 = (g25) pg7;
                ((TextView) this.K0).setText(g25.a);
                StringBuilder sb = new StringBuilder();
                sb.append("completedTasks: ");
                sb.append(g25.c);
                sb.append(", activeTasks: ");
                int i2 = g25.o;
                sb.append(i2);
                sb.append(", idleThreads: ");
                sb.append(g25.b);
                sb.append(", tasksInQueue: ");
                sb.append(i2);
                ((TextView) this.L0).setText(sb);
                ((TextView) this.M0).setText("isShutdown: " + g25.Y + ", isTerminated: " + g25.Z);
                return;
        }
    }

    public void B(pg7 pg7, Object obj) {
        switch (this.J0) {
            case 1:
                if (!(obj instanceof ci8)) {
                    A(pg7);
                    return;
                }
                ryb ryb = ((ci8) obj).a;
                ((TextView) this.L0).setText(ryb != null ? ryb.a : null);
                return;
            default:
                super.B(pg7, obj);
                return;
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rq3(android.content.Context r2, defpackage.smc r3, defpackage.io8 r4) {
        /*
            r1 = this;
            r0 = 0
            r1.J0 = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r2)
            r1.<init>(r0)
            r1.K0 = r3
            r1.L0 = r4
            r1.M0 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.<init>(android.content.Context, smc, io8):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rq3(android.content.Context r9, defpackage.h87 r10) {
        /*
            r8 = this;
            r0 = 1
            r8.J0 = r0
            android.widget.FrameLayout r0 = new android.widget.FrameLayout
            r0.<init>(r9)
            n6c r1 = new n6c
            r2 = -1
            r3 = -2
            r1.<init>(r2, r3)
            r0.setLayoutParams(r1)
            kh3 r1 = new kh3
            r4 = 0
            r1.<init>(r9, r4)
            int r4 = defpackage.a7a.G
            r1.setId(r4)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r6 = 16
            r5.<init>(r2, r3, r6)
            r1.setLayoutParams(r5)
            r2 = 24
            float r2 = (float) r2
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r3 = r3 * r2
            int r3 = a24.X(r3)
            r5 = 12
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            int r3 = defpackage.me4.c(r5, r6, r3)
            int r5 = r1.getPaddingTop()
            int r6 = r1.getPaddingBottom()
            r7 = 0
            r1.setPadding(r7, r5, r3, r6)
            r0.addView(r1)
            android.widget.TextView r1 = new android.widget.TextView
            r1.<init>(r9)
            int r9 = defpackage.a7a.H
            r1.setId(r9)
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r2 = r2 * r3
            int r2 = a24.X(r2)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r5 = 8388629(0x800015, float:1.1754973E-38)
            r3.<init>(r2, r2, r5)
            r1.setLayoutParams(r3)
            r2 = 17
            r1.setGravity(r2)
            r2 = 1
            r3 = 1098907648(0x41800000, float:16.0)
            r1.setTextSize(r2, r3)
            r0.addView(r1)
            r8.<init>(r0)
            android.view.View r1 = r0.findViewById(r4)
            kh3 r1 = (kh3) r1
            r8.K0 = r1
            android.view.View r9 = r0.findViewById(r9)
            android.widget.TextView r9 = (android.widget.TextView) r9
            r8.L0 = r9
            xv5 r9 = new xv5
            r1 = 14
            r9.<init>(r8, r1, r10)
            a24.a0(r0, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.<init>(android.content.Context, h87):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public rq3(android.content.Context r8) {
        /*
            r7 = this;
            r0 = 3
            r7.J0 = r0
            android.view.ViewGroup$LayoutParams r0 = new android.view.ViewGroup$LayoutParams
            r1 = -1
            r2 = -2
            r0.<init>(r1, r2)
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r8)
            r1.setLayoutParams(r0)
            int r0 = bpb.threads_state_state_view
            r1.setId(r0)
            r0 = 1
            r1.setOrientation(r0)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            r3.setLayoutParams(r4)
            r4 = 1099956224(0x41900000, float:18.0)
            r3.setTextSize(r4)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setTextColor(r4)
            r1.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r2, r2)
            r5 = 5
            float r5 = (float) r5
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r6 = r6 * r5
            int r6 = a24.X(r6)
            r4.topMargin = r6
            r3.setLayoutParams(r4)
            r4 = 1096810496(0x41600000, float:14.0)
            r3.setTextSize(r4)
            r6 = -16776961(0xffffffffff0000ff, float:-1.7014636E38)
            r3.setTextColor(r6)
            r1.addView(r3)
            android.widget.TextView r3 = new android.widget.TextView
            r3.<init>(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r8.<init>(r2, r2)
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r5 = r5 * r2
            int r2 = a24.X(r5)
            r8.topMargin = r2
            r3.setLayoutParams(r8)
            r3.setTextSize(r4)
            r3.setTextColor(r6)
            r1.addView(r3)
            r7.<init>(r1)
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r2 = 0
            android.view.View r8 = r8.getChildAt(r2)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.K0 = r8
            r8 = r1
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            android.view.View r8 = r8.getChildAt(r0)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.L0 = r8
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r8 = 2
            android.view.View r8 = r1.getChildAt(r8)
            android.widget.TextView r8 = (android.widget.TextView) r8
            r7.M0 = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq3.<init>(android.content.Context):void");
    }
}
