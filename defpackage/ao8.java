package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import java.util.Arrays;
import java.util.List;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.MessagesListWidget;

/* renamed from: ao8  reason: default package */
public abstract class ao8 extends gt8 implements tp8, gg6 {
    public static final int[] V0 = {16842910, 16842919};
    public static final int[] W0 = {16842910};
    public final View M0;
    public long N0 = -1;
    public dcf O0 = dcf.None;
    public rz P0;
    public final t97 Q0 = ez3.O(3, new ib7(25));
    public final t97 R0 = ez3.O(3, new qk8(1, this));
    public final boolean S0;
    public long T0;
    public ValueAnimator U0;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ao8(android.content.Context r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            sn8 r0 = new sn8
            r0.<init>(r4)
            r3.<init>(r0)
            r3.M0 = r5
            r1 = -1
            r3.N0 = r1
            dcf r4 = defpackage.dcf.None
            r3.O0 = r4
            ib7 r4 = new ib7
            r1 = 25
            r4.<init>(r1)
            r1 = 3
            t97 r4 = ez3.O(r1, r4)
            r3.Q0 = r4
            qk8 r4 = new qk8
            r2 = 1
            r4.<init>(r2, r3)
            t97 r4 = ez3.O(r1, r4)
            r3.R0 = r4
            r4 = 6
            float r4 = (float) r4
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            float r4 = r4 * r1
            int r4 = a24.X(r4)
            r1 = 0
            r0.setPaddingRelative(r4, r1, r4, r1)
            rn8 r4 = new rn8
            r4.<init>()
            android.view.View r2 = r0.y0
            if (r2 == 0) goto L_0x004d
            r0.removeView(r2)
        L_0x004d:
            r0.y0 = r5
            r0.addView(r5, r4)
            r5.setClipChildren(r1)
            r4 = 1
            r3.S0 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao8.<init>(android.content.Context, android.view.ViewGroup):void");
    }

    public static boolean R(ht8 ht8, rz rzVar) {
        if (ht8 == null) {
            return false;
        }
        sy7 sy7 = rzVar instanceof sy7 ? (sy7) rzVar : null;
        int i = ht8.a;
        boolean z = sy7 != null && sy7.c() && ht8.c(i);
        return ((i & 4096) == 0 && (i & 128) == 0 && (i & 16384) == 0 && (32768 & i) == 0 && ((i & 2) == 0 || z) && ((!ht8.b(i) || z) && ((i & 4) == 0 || z))) ? false : true;
    }

    public void D() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:133:0x01d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void F(one.me.messages.list.loader.MessageModel r20, java.util.List r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            int r2 = r1.L0
            ht8 r3 = new ht8
            r3.<init>(r2)
            r0.L0 = r3
            long r2 = r1.a
            r0.N0 = r2
            long r2 = r1.b
            r0.T0 = r2
            wy r2 = r1.y0
            rz r3 = r2.d
            r0.P0 = r3
            dcf r3 = r1.Z
            r0.O0 = r3
            android.view.View r4 = r0.a
            r5 = r4
            sn8 r5 = (defpackage.sn8) r5
            er8 r6 = r1.K0
            if (r6 == 0) goto L_0x002b
            long r6 = r6.a
            goto L_0x002d
        L_0x002b:
            r6 = 0
        L_0x002d:
            r5.setAvatarId(r6)
            er8 r6 = r1.K0
            r7 = 0
            r8 = 1
            if (r6 == 0) goto L_0x0038
            r6 = r8
            goto L_0x0039
        L_0x0038:
            r6 = r7
        L_0x0039:
            r5.setOffsetBubbleByAvatar(r6)
            int r5 = r20.hashCode()
            android.view.View r6 = r0.M0
            r6.setId(r5)
            boolean r5 = r6 instanceof defpackage.mha
            if (r5 == 0) goto L_0x004d
            r5 = r6
            mha r5 = (defpackage.mha) r5
            goto L_0x004e
        L_0x004d:
            r5 = 0
        L_0x004e:
            boolean r2 = r2.b
            if (r5 == 0) goto L_0x0055
            r5.setDependOnOutsideView(r2)
        L_0x0055:
            boolean r5 = r21.isEmpty()
            r5 = r5 ^ r8
            s59 r10 = km4.y0
            qs8 r12 = r1.A0
            boolean r13 = r1.z0
            java.lang.CharSequence r14 = r1.X
            if (r5 == 0) goto L_0x01e6
            java.util.Iterator r5 = r21.iterator()
        L_0x0068:
            boolean r15 = r5.hasNext()
            if (r15 == 0) goto L_0x01e2
            java.lang.Object r15 = r5.next()
            boolean r9 = r15 instanceof defpackage.pr8
            if (r9 == 0) goto L_0x0068
            pr8 r15 = (defpackage.pr8) r15
            boolean r9 = r15.a
            if (r9 == 0) goto L_0x008c
            boolean r9 = r6 instanceof defpackage.yxc
            if (r9 == 0) goto L_0x0084
            r9 = r6
            yxc r9 = (defpackage.yxc) r9
            goto L_0x0085
        L_0x0084:
            r9 = 0
        L_0x0085:
            if (r9 == 0) goto L_0x008c
            android.text.Layout r11 = r1.I0
            r9.setSenderName(r11)
        L_0x008c:
            boolean r9 = r15.b
            if (r9 == 0) goto L_0x00a0
            boolean r9 = r6 instanceof defpackage.vxc
            if (r9 == 0) goto L_0x0098
            r9 = r6
            vxc r9 = (defpackage.vxc) r9
            goto L_0x0099
        L_0x0098:
            r9 = 0
        L_0x0099:
            if (r9 == 0) goto L_0x00a0
            android.text.Layout r11 = r1.J0
            r9.setAlias(r11)
        L_0x00a0:
            boolean r9 = r15.d
            if (r9 == 0) goto L_0x00b2
            boolean r9 = r6 instanceof defpackage.i04
            if (r9 == 0) goto L_0x00ac
            r9 = r6
            i04 r9 = (defpackage.i04) r9
            goto L_0x00ad
        L_0x00ac:
            r9 = 0
        L_0x00ad:
            if (r9 == 0) goto L_0x00b2
            r9.setDateViewStatus(r3)
        L_0x00b2:
            boolean r9 = r15.c
            if (r9 == 0) goto L_0x00c4
            boolean r9 = r6 instanceof defpackage.i04
            if (r9 == 0) goto L_0x00be
            r9 = r6
            i04 r9 = (defpackage.i04) r9
            goto L_0x00bf
        L_0x00be:
            r9 = 0
        L_0x00bf:
            if (r9 == 0) goto L_0x00c4
            r9.g(r14, r7)
        L_0x00c4:
            boolean r9 = r15.g
            if (r9 == 0) goto L_0x00d6
            boolean r9 = r6 instanceof defpackage.i04
            if (r9 == 0) goto L_0x00d0
            r9 = r6
            i04 r9 = (defpackage.i04) r9
            goto L_0x00d1
        L_0x00d0:
            r9 = 0
        L_0x00d1:
            if (r9 == 0) goto L_0x00d6
            r9.g(r14, r13)
        L_0x00d6:
            boolean r9 = r15.e
            if (r9 == 0) goto L_0x00f7
            boolean r9 = r6 instanceof defpackage.wfe
            if (r9 == 0) goto L_0x00e2
            r9 = r6
            wfe r9 = (defpackage.wfe) r9
            goto L_0x00e3
        L_0x00e2:
            r9 = 0
        L_0x00e3:
            if (r9 == 0) goto L_0x00f7
            if (r12 == 0) goto L_0x00eb
            r9.setTextMessageLayout(r12)
            goto L_0x00f7
        L_0x00eb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "messageTextLayout is null"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00f7:
            boolean r9 = r15.f
            if (r9 == 0) goto L_0x0117
            r0.I(r1, r8)
            pda r9 = r10.r(r4)
            jo2 r9 = r9.a()
            int r11 = r1.L0
            r16 = 2080374784(0x7c000000, float:2.658456E36)
            r11 = r11 & r16
            boolean r11 = defpackage.ir0.b(r11)
            dr0 r9 = r9.a(r11)
            r0.a(r9)
        L_0x0117:
            boolean r9 = r15.h
            if (r9 == 0) goto L_0x01ca
            rz r9 = r0.P0
            boolean r11 = r9 instanceof defpackage.pc5
            if (r11 == 0) goto L_0x0133
            boolean r11 = r6 instanceof defpackage.qe5
            if (r11 == 0) goto L_0x0129
            r11 = r6
            qe5 r11 = (defpackage.qe5) r11
            goto L_0x012a
        L_0x0129:
            r11 = 0
        L_0x012a:
            if (r11 == 0) goto L_0x01ca
            pc5 r9 = (defpackage.pc5) r9
            r11.A(r9)
            goto L_0x01ca
        L_0x0133:
            boolean r11 = r9 instanceof defpackage.m40
            if (r11 == 0) goto L_0x0172
            boolean r11 = r6 instanceof defpackage.r40
            if (r11 == 0) goto L_0x013f
            r11 = r6
            r40 r11 = (defpackage.r40) r11
            goto L_0x0140
        L_0x013f:
            r11 = 0
        L_0x0140:
            if (r11 == 0) goto L_0x01ca
            m40 r9 = (defpackage.m40) r9
            java.lang.String r8 = r11.V0
            int r8 = r8.length()
            if (r8 <= 0) goto L_0x014d
            goto L_0x0155
        L_0x014d:
            java.lang.String r8 = r9.d
            int r17 = r8.length()
            if (r17 != 0) goto L_0x0157
        L_0x0155:
            goto L_0x01ca
        L_0x0157:
            r11.V0 = r8
            t60 r8 = r11.H0
            byte[] r7 = r9.h
            r18 = r4
            r21 = r5
            long r4 = r9.j
            r8.b(r4, r7)
            n40 r4 = new n40
            r5 = 0
            r4.<init>(r11, r9, r5)
            androidx.appcompat.widget.AppCompatImageView r5 = r11.z0
            a24.a0(r5, r4)
            goto L_0x01ce
        L_0x0172:
            r18 = r4
            r21 = r5
            boolean r4 = r9 instanceof defpackage.w13
            if (r4 == 0) goto L_0x018b
            boolean r4 = r6 instanceof defpackage.p13
            if (r4 == 0) goto L_0x0182
            r4 = r6
            p13 r4 = (defpackage.p13) r4
            goto L_0x0183
        L_0x0182:
            r4 = 0
        L_0x0183:
            if (r4 == 0) goto L_0x01ce
            w13 r9 = (defpackage.w13) r9
            r4.a(r9)
            goto L_0x01ce
        L_0x018b:
            boolean r4 = r9 instanceof defpackage.qhd
            if (r4 == 0) goto L_0x01a0
            boolean r4 = r6 instanceof defpackage.rhd
            if (r4 == 0) goto L_0x0197
            r4 = r6
            rhd r4 = (defpackage.rhd) r4
            goto L_0x0198
        L_0x0197:
            r4 = 0
        L_0x0198:
            if (r4 == 0) goto L_0x01ce
            qhd r9 = (defpackage.qhd) r9
            r4.p(r9)
            goto L_0x01ce
        L_0x01a0:
            boolean r4 = r9 instanceof defpackage.wid
            if (r4 == 0) goto L_0x01b5
            boolean r4 = r6 instanceof defpackage.xid
            if (r4 == 0) goto L_0x01ac
            r4 = r6
            xid r4 = (defpackage.xid) r4
            goto L_0x01ad
        L_0x01ac:
            r4 = 0
        L_0x01ad:
            if (r4 == 0) goto L_0x01ce
            wid r9 = (defpackage.wid) r9
            r4.i(r9)
            goto L_0x01ce
        L_0x01b5:
            boolean r4 = r9 instanceof defpackage.h5f
            if (r4 == 0) goto L_0x01ce
            boolean r4 = r6 instanceof defpackage.a6f
            if (r4 == 0) goto L_0x01c1
            r4 = r6
            a6f r4 = (defpackage.a6f) r4
            goto L_0x01c2
        L_0x01c1:
            r4 = 0
        L_0x01c2:
            if (r4 == 0) goto L_0x01ce
            h5f r9 = (defpackage.h5f) r9
            r4.v(r9)
            goto L_0x01ce
        L_0x01ca:
            r18 = r4
            r21 = r5
        L_0x01ce:
            boolean r4 = r15.i
            if (r4 == 0) goto L_0x01da
            if (r2 != 0) goto L_0x01d7
            r19.S(r20)
        L_0x01d7:
            r19.H(r20)
        L_0x01da:
            r5 = r21
            r4 = r18
            r7 = 0
            r8 = 1
            goto L_0x0068
        L_0x01e2:
            r6.requestLayout()
            return
        L_0x01e6:
            r18 = r4
            boolean r2 = r6 instanceof defpackage.yxc
            if (r2 == 0) goto L_0x01f0
            r2 = r6
            yxc r2 = (defpackage.yxc) r2
            goto L_0x01f1
        L_0x01f0:
            r2 = 0
        L_0x01f1:
            if (r2 == 0) goto L_0x01f8
            android.text.Layout r4 = r1.I0
            r2.setSenderName(r4)
        L_0x01f8:
            boolean r2 = r6 instanceof defpackage.vxc
            if (r2 == 0) goto L_0x0200
            r2 = r6
            vxc r2 = (defpackage.vxc) r2
            goto L_0x0201
        L_0x0200:
            r2 = 0
        L_0x0201:
            if (r2 == 0) goto L_0x0208
            android.text.Layout r4 = r1.J0
            r2.setAlias(r4)
        L_0x0208:
            boolean r2 = r6 instanceof defpackage.i04
            if (r2 == 0) goto L_0x0210
            r2 = r6
            i04 r2 = (defpackage.i04) r2
            goto L_0x0211
        L_0x0210:
            r2 = 0
        L_0x0211:
            if (r2 == 0) goto L_0x0219
            r2.setDateViewStatus(r3)
            r2.g(r14, r13)
        L_0x0219:
            boolean r2 = r6 instanceof defpackage.zq8
            if (r2 == 0) goto L_0x022e
            tq8 r2 = r1.B0
            if (r2 == 0) goto L_0x0228
            r3 = r6
            zq8 r3 = (defpackage.zq8) r3
            r3.setLink(r2)
            goto L_0x022e
        L_0x0228:
            r2 = r6
            zq8 r2 = (defpackage.zq8) r2
            r2.l()
        L_0x022e:
            if (r12 == 0) goto L_0x023e
            boolean r2 = r6 instanceof defpackage.wfe
            if (r2 == 0) goto L_0x0238
            r9 = r6
            wfe r9 = (defpackage.wfe) r9
            goto L_0x0239
        L_0x0238:
            r9 = 0
        L_0x0239:
            if (r9 == 0) goto L_0x023e
            r9.setTextMessageLayout(r12)
        L_0x023e:
            r19.S(r20)
            r0.G(r1, r6)
            r2 = 0
            r0.I(r1, r2)
            r19.H(r20)
            r2 = r18
            pda r3 = r10.r(r2)
            jo2 r3 = r3.a()
            int r4 = r1.L0
            r5 = 2080374784(0x7c000000, float:2.658456E36)
            r4 = r4 & r5
            boolean r4 = defpackage.ir0.b(r4)
            dr0 r3 = r3.a(r4)
            r0.a(r3)
            pda r2 = r10.r(r2)
            jo2 r2 = r2.a()
            j53 r2 = r2.o()
            r0.e(r2)
            r19.M(r20)
            r6.requestLayout()
            r6.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao8.F(one.me.messages.list.loader.MessageModel, java.util.List):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void H(one.me.messages.list.loader.MessageModel r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            wy r2 = r1.y0
            vw6 r2 = r2.e
            t97 r3 = r0.R0
            if (r2 != 0) goto L_0x001f
            boolean r0 = r3.a()
            if (r0 == 0) goto L_0x01f2
            java.lang.Object r0 = r3.getValue()
            yw6 r0 = (defpackage.yw6) r0
            r1 = 8
            r0.setVisibility(r1)
            goto L_0x01f2
        L_0x001f:
            java.lang.Object r2 = r3.getValue()
            yw6 r2 = (defpackage.yw6) r2
            wy r4 = r1.y0
            vw6 r4 = r4.e
            long r5 = r1.a
            r2.c = r5
            r2.o = r4
            ku0 r1 = r2.w0
            r77 r5 = r1.z0
            if (r5 == 0) goto L_0x003c
            vw6 r5 = (defpackage.vw6) r5
            boolean r5 = r5.a(r4)
            goto L_0x003d
        L_0x003c:
            r5 = 0
        L_0x003d:
            r15 = 1
            r5 = r5 ^ r15
            if (r5 != 0) goto L_0x0046
            r1.invalidate()
            goto L_0x01cf
        L_0x0046:
            r77 r5 = r1.z0
            f r14 = new f
            java.lang.String r12 = "bindLoading(Lru/ok/tamtam/models/bots/Keyboard;)V"
            r13 = 0
            r8 = 1
            java.lang.Class<ku0> r10 = defpackage.ku0.class
            java.lang.String r11 = "bindLoading"
            r16 = 2
            r7 = r14
            r9 = r1
            r15 = r14
            r14 = r16
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            java.util.List r7 = r4.a
            if (r5 != 0) goto L_0x0063
        L_0x0060:
            r10 = 0
            goto L_0x00ce
        L_0x0063:
            vw6 r5 = (defpackage.vw6) r5
            int r8 = r7.size()
            java.util.List r5 = r5.a
            int r9 = r5.size()
            if (r8 == r9) goto L_0x0072
            goto L_0x0060
        L_0x0072:
            int r8 = r7.size()
            r9 = 0
            r10 = 0
        L_0x0078:
            if (r9 >= r8) goto L_0x00ce
            java.lang.Object r11 = r7.get(r9)
            fu0 r11 = (defpackage.fu0) r11
            int r12 = r11.size()
            java.lang.Object r13 = r5.get(r9)
            fu0 r13 = (defpackage.fu0) r13
            int r13 = r13.size()
            if (r12 == r13) goto L_0x0091
            goto L_0x0060
        L_0x0091:
            int r12 = r11.size()
            r13 = 0
        L_0x0096:
            if (r13 >= r12) goto L_0x00c7
            java.lang.Object r14 = r11.get(r13)
            yt0 r14 = (defpackage.yt0) r14
            java.lang.Object r16 = r5.get(r9)
            r6 = r16
            fu0 r6 = (defpackage.fu0) r6
            java.lang.Object r6 = r6.get(r13)
            yt0 r6 = (defpackage.yt0) r6
            r16 = r5
            boolean r5 = r14.w0
            r18 = r8
            boolean r8 = r6.w0
            if (r5 == r8) goto L_0x00c0
            boolean r5 = r14.equals(r6)
            if (r5 == 0) goto L_0x00c0
            r15.invoke(r4)
            r10 = 1
        L_0x00c0:
            int r13 = r13 + 1
            r5 = r16
            r8 = r18
            goto L_0x0096
        L_0x00c7:
            r16 = r5
            r18 = r8
            int r9 = r9 + 1
            goto L_0x0078
        L_0x00ce:
            if (r10 == 0) goto L_0x00d2
            goto L_0x01cf
        L_0x00d2:
            r5 = 0
            r1.P0 = r5
            r1.z0 = r4
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r7.size()
            r6 = 0
        L_0x00e1:
            if (r6 >= r5) goto L_0x019c
            java.lang.Object r8 = r7.get(r6)
            fu0 r8 = (defpackage.fu0) r8
            int r9 = r8.size()
            int r10 = r8.size()
            r11 = 1
            if (r10 != r11) goto L_0x00f6
            r10 = 1
            goto L_0x00f7
        L_0x00f6:
            r10 = 0
        L_0x00f7:
            int r11 = r8.size()
            r21 = r9
            r9 = 0
        L_0x00fe:
            if (r9 >= r11) goto L_0x0194
            java.lang.Object r12 = r8.get(r9)
            r19 = r12
            yt0 r19 = (defpackage.yt0) r19
            if (r9 != 0) goto L_0x010d
            r23 = 1
            goto L_0x010f
        L_0x010d:
            r23 = 0
        L_0x010f:
            int r12 = r8.size()
            r13 = 1
            int r12 = r12 - r13
            if (r9 != r12) goto L_0x011a
            r24 = r13
            goto L_0x011c
        L_0x011a:
            r24 = 0
        L_0x011c:
            int r12 = r7.size()
            int r12 = r12 - r13
            if (r6 != r12) goto L_0x0125
            r12 = 1
            goto L_0x0126
        L_0x0125:
            r12 = 0
        L_0x0126:
            float r13 = r2.a
            r14 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r15 = (r13 > r14 ? 1 : (r13 == r14 ? 0 : -1))
            r16 = r5
            float r5 = r2.b
            if (r15 != 0) goto L_0x013c
            int r14 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            if (r14 != 0) goto L_0x013c
            r5 = 0
            r25 = r5
            r26 = 1
            goto L_0x017b
        L_0x013c:
            r14 = 4
            float[] r15 = new float[r14]
            r17 = 0
            r15[r17] = r5
            r26 = 1
            r15[r26] = r5
            r18 = 2
            r15[r18] = r5
            r20 = 3
            r15[r20] = r5
            if (r12 == 0) goto L_0x0179
            if (r23 == 0) goto L_0x0160
            if (r24 == 0) goto L_0x0160
            float[] r15 = new float[r14]
            r15[r17] = r5
            r15[r26] = r5
            r15[r18] = r13
            r15[r20] = r13
            goto L_0x0179
        L_0x0160:
            if (r23 == 0) goto L_0x016d
            float[] r15 = new float[r14]
            r15[r17] = r5
            r15[r26] = r5
            r15[r18] = r5
            r15[r20] = r13
            goto L_0x0179
        L_0x016d:
            if (r24 == 0) goto L_0x0179
            float[] r15 = new float[r14]
            r15[r17] = r5
            r15[r26] = r5
            r15[r18] = r13
            r15[r20] = r5
        L_0x0179:
            r25 = r15
        L_0x017b:
            fp0 r5 = new fp0
            d10 r20 = new d10
            r20.<init>()
            r18 = r5
            r22 = r10
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r4.add(r5)
            int r9 = r9 + 1
            r21 = -1
            r5 = r16
            goto L_0x00fe
        L_0x0194:
            r16 = r5
            r26 = 1
            int r6 = r6 + 1
            goto L_0x00e1
        L_0x019c:
            r1.y0 = r4
            ov6 r2 = r1.K0
            if (r2 != 0) goto L_0x01cc
            ov6 r2 = new ov6
            r2.<init>()
            s59 r4 = km4.y0
            pda r5 = r4.r(r1)
            ib6 r5 = r5.d()
            lb6 r5 = r5.f
            int r5 = r5.b
            pda r4 = r4.r(r1)
            ib6 r4 = r4.d()
            lb6 r4 = r4.f
            int r4 = r4.a
            int[] r4 = new int[]{r5, r4}
            r2.b = r4
            r2.setCallback(r1)
            r1.K0 = r2
        L_0x01cc:
            r1.requestLayout()
        L_0x01cf:
            android.view.View r0 = r0.a
            sn8 r0 = (defpackage.sn8) r0
            java.lang.Object r1 = r3.getValue()
            android.view.View r1 = (android.view.View) r1
            rn8 r2 = new rn8
            r2.<init>()
            android.view.View r4 = r0.z0
            if (r4 == 0) goto L_0x01e3
            goto L_0x01e8
        L_0x01e3:
            r0.z0 = r1
            r0.addView(r1, r2)
        L_0x01e8:
            java.lang.Object r0 = r3.getValue()
            android.view.View r0 = (android.view.View) r0
            r1 = 0
            r0.setVisibility(r1)
        L_0x01f2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao8.H(one.me.messages.list.loader.MessageModel):void");
    }

    public final void I(MessageModel messageModel, boolean z) {
        View view = this.M0;
        if (view instanceof i0c) {
            i0c i0c = (i0c) view;
            i0c.setIsIncoming(messageModel.G0);
            if (!z) {
                i0c.setStackFromEnd(!messageModel.G0 && R(new ht8(messageModel.L0), messageModel.y0.d));
            }
            yr8 yr8 = messageModel.E0;
            if (yr8 != null) {
                i0c.f(yr8, z);
            } else {
                i0c.q(z);
            }
        }
    }

    public final void J() {
        ValueAnimator valueAnimator = this.U0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        View view = this.M0;
        jg6 jg6 = view instanceof jg6 ? (jg6) view : null;
        if (jg6 != null) {
            jg6.e((List) null, (i26) null);
        }
    }

    public final ShapeDrawable K() {
        float[] fArr;
        Drawable background = this.M0.getBackground();
        on8 on8 = background instanceof on8 ? (on8) background : null;
        if (on8 != null) {
            float[] fArr2 = on8.p;
            fArr = Arrays.copyOf(fArr2, fArr2.length);
        } else {
            fArr = (float[]) this.Q0.getValue();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(km4.y0.r(this.a).c().a.r);
        shapeDrawable.setAlpha(150);
        return shapeDrawable;
    }

    public final void L(qn8 qn8, String str) {
        rz rzVar = this.P0;
        View view = this.M0;
        if (rzVar != null) {
            long j = this.N0;
            k09 k09 = (k09) qn8;
            k09.getClass();
            k77[] k77Arr = MessagesListWidget.b1;
            MessagesListWidget messagesListWidget = k09.a;
            if (!messagesListWidget.t0().G(rzVar, j, str)) {
                messagesListWidget.v0(j, view);
                return;
            }
            return;
        }
        long j2 = this.N0;
        k09 k092 = (k09) qn8;
        k092.getClass();
        k77[] k77Arr2 = MessagesListWidget.b1;
        k092.a.v0(j2, view);
    }

    public void M(MessageModel messageModel) {
    }

    public void N(dr0 dr0) {
    }

    public void P(j53 j53) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: android.view.View} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: jg6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: jg6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Q(defpackage.fg6 r8, i26 r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 != 0) goto L_0x0007
            r7.J()
            goto L_0x0072
        L_0x0007:
            long r1 = r7.N0
            long r3 = r8.a
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            r3 = 0
            android.view.View r4 = r7.M0
            java.util.List r8 = r8.b
            if (r1 != 0) goto L_0x0027
            android.animation.ValueAnimator r5 = r7.U0
            if (r5 == 0) goto L_0x0027
            boolean r7 = r4 instanceof defpackage.jg6
            if (r7 == 0) goto L_0x0020
            r3 = r4
            jg6 r3 = (defpackage.jg6) r3
        L_0x0020:
            if (r3 == 0) goto L_0x0025
            r3.e(r8, r9)
        L_0x0025:
            r0 = r2
            goto L_0x0072
        L_0x0027:
            if (r1 != 0) goto L_0x006f
            android.graphics.drawable.ShapeDrawable r1 = r7.K()
            r4.setForeground(r1)
            android.graphics.drawable.ShapeDrawable r1 = r7.K()
            int r1 = r1.getAlpha()
            int[] r0 = new int[]{r1, r0}
            android.animation.ValueAnimator r0 = android.animation.ValueAnimator.ofInt(r0)
            r5 = 300(0x12c, double:1.48E-321)
            r0.setStartDelay(r5)
            r5 = 800(0x320, double:3.953E-321)
            r0.setDuration(r5)
            c00 r1 = new c00
            r5 = 12
            r1.<init>(r5, r7)
            r0.addUpdateListener(r1)
            mf r1 = new mf
            r5 = 4
            r1.<init>(r5, r7)
            r0.addListener(r1)
            r0.start()
            r7.U0 = r0
            boolean r7 = r4 instanceof defpackage.jg6
            if (r7 == 0) goto L_0x0069
            r3 = r4
            jg6 r3 = (defpackage.jg6) r3
        L_0x0069:
            if (r3 == 0) goto L_0x0025
            r3.e(r8, r9)
            goto L_0x0025
        L_0x006f:
            r7.J()
        L_0x0072:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao8.Q(fg6, i26):boolean");
    }

    public final void S(MessageModel messageModel) {
        int i;
        Drawable background = this.M0.getBackground();
        on8 on8 = background instanceof on8 ? (on8) background : null;
        if (on8 != null) {
            boolean b = ir0.b(messageModel.L0 & 2080374784);
            dr0 a = km4.y0.r(this.a).a().a(b);
            boolean z = messageModel.y0.b;
            int i2 = a.d.b;
            int i3 = messageModel.L0;
            int i4 = 2080374784 & i3;
            boolean z2 = true;
            if (ir0.c(i4)) {
                i = 1;
            } else if (ir0.a(i4)) {
                i = 2;
            } else if ((1073741824 & i3) != 0) {
                i = 4;
            } else if ((i3 & 536870912) != 0) {
                i = 3;
            } else {
                throw new IllegalStateException(("unknown bubble type " + ir0.d(i4)).toString());
            }
            lu7 lu7 = on8.y;
            boolean z3 = on8.c;
            boolean z4 = messageModel.w0;
            boolean z5 = messageModel.x0;
            if (z3 == z4 && on8.a == b && on8.x == i && on8.d == z5 && hhd.f(on8.e, (Object) null) && on8.f == z) {
                z2 = false;
            }
            on8.b = false;
            on8.c = z4;
            on8.g = i2;
            on8.a = b;
            on8.x = i;
            on8.d = z5;
            on8.e = null;
            on8.f = z;
            if (z2) {
                on8.b(on8.getBounds());
            }
            if (z2) {
                on8.invalidateSelf();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.dr0 r9) {
        /*
            r8 = this;
            android.view.View r0 = r8.M0
            boolean r1 = r0 instanceof defpackage.yxc
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r0
            yxc r1 = (defpackage.yxc) r1
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            gr0 r3 = r9.b
            if (r1 == 0) goto L_0x0015
            int r4 = r3.g
            r1.setSenderNameColor(r4)
        L_0x0015:
            boolean r1 = r0 instanceof defpackage.vxc
            if (r1 == 0) goto L_0x001d
            r1 = r0
            vxc r1 = (defpackage.vxc) r1
            goto L_0x001e
        L_0x001d:
            r1 = r2
        L_0x001e:
            if (r1 == 0) goto L_0x0025
            int r3 = r3.e
            r1.setAliasColor(r3)
        L_0x0025:
            boolean r1 = r0 instanceof defpackage.wfe
            if (r1 == 0) goto L_0x002d
            r1 = r0
            wfe r1 = (defpackage.wfe) r1
            goto L_0x002e
        L_0x002d:
            r1 = r2
        L_0x002e:
            if (r1 == 0) goto L_0x0033
            r1.setTextMessageColors(r9)
        L_0x0033:
            boolean r1 = r0 instanceof defpackage.zq8
            if (r1 == 0) goto L_0x003b
            r1 = r0
            zq8 r1 = (defpackage.zq8) r1
            goto L_0x003c
        L_0x003b:
            r1 = r2
        L_0x003c:
            if (r1 == 0) goto L_0x0041
            r1.c(r9)
        L_0x0041:
            boolean r1 = r0 instanceof defpackage.i0c
            if (r1 == 0) goto L_0x0049
            r1 = r0
            i0c r1 = (defpackage.i0c) r1
            goto L_0x004a
        L_0x0049:
            r1 = r2
        L_0x004a:
            r3 = 1
            if (r1 == 0) goto L_0x0059
            ht8 r4 = r8.L0
            rz r5 = r8.P0
            boolean r4 = R(r4, r5)
            r4 = r4 ^ r3
            r1.k(r9, r4)
        L_0x0059:
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            boolean r1 = r0 instanceof defpackage.on8
            if (r1 == 0) goto L_0x0064
            r2 = r0
            on8 r2 = (defpackage.on8) r2
        L_0x0064:
            if (r2 == 0) goto L_0x009e
            s59 r0 = km4.y0
            android.view.View r1 = r8.a
            pda r4 = r0.r(r1)
            jo2 r4 = r4.a()
            dr0 r4 = r4.c()
            xq0 r4 = r4.a
            int[] r4 = r4.l
            k77[] r5 = defpackage.on8.z
            r6 = 0
            r6 = r5[r6]
            nn8 r7 = r2.u
            r7.o1(r2, r6, r4)
            pda r0 = r0.r(r1)
            jo2 r0 = r0.a()
            dr0 r0 = r0.f()
            xq0 r0 = r0.a
            int[] r0 = r0.l
            r1 = r5[r3]
            nn8 r3 = r2.v
            r3.o1(r2, r1, r0)
            r2.invalidateSelf()
        L_0x009e:
            r8.N(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao8.a(dr0):void");
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [android.graphics.drawable.Drawable] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void e(defpackage.j53 r5) {
        /*
            r4 = this;
            android.view.View r0 = r4.M0
            boolean r1 = r0 instanceof defpackage.i04
            r2 = 0
            if (r1 == 0) goto L_0x000b
            r1 = r0
            i04 r1 = (defpackage.i04) r1
            goto L_0x000c
        L_0x000b:
            r1 = r2
        L_0x000c:
            if (r1 == 0) goto L_0x0015
            b43 r3 = r5.a
            int r3 = r3.g
            r1.setDateBackgroundColor(r3)
        L_0x0015:
            android.graphics.drawable.Drawable r0 = r0.getForeground()
            boolean r1 = r0 instanceof android.graphics.drawable.ShapeDrawable
            if (r1 == 0) goto L_0x0020
            r2 = r0
            android.graphics.drawable.ShapeDrawable r2 = (android.graphics.drawable.ShapeDrawable) r2
        L_0x0020:
            if (r2 == 0) goto L_0x003b
            android.graphics.Paint r0 = r2.getPaint()
            if (r0 == 0) goto L_0x003b
            s59 r1 = km4.y0
            android.view.View r2 = r4.a
            pda r1 = r1.r(r2)
            ord r1 = r1.c()
            nrd r1 = r1.a
            int r1 = r1.r
            r0.setColor(r1)
        L_0x003b:
            r4.P(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao8.e(j53):void");
    }
}
