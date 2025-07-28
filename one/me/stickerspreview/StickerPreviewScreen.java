package one.me.stickerspreview;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import one.me.stickerspreview.set.StickerSetBottomSheet;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\u000b¨\u0006\f"}, d2 = {"Lone/me/stickerspreview/StickerPreviewScreen;", "Lone/me/sdk/arch/Widget;", "Laud;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "stickerId", "chatId", "forwardId", "(JJJ)V", "stickers-preview_release"}, k = 1, mv = {2, 0, 0})
public final class StickerPreviewScreen extends Widget implements aud {
    public static final /* synthetic */ k77[] E0;
    public final n0c A0;
    public final ebc B0;
    public final ebc C0;
    public final ebc D0;
    public final t97 X;
    public final t97 Y;
    public final er7 Z;
    public final jr a;
    public final jr b;
    public final sy6 c;
    public final String o;
    public final n0c w0;
    public final n0c x0;
    public final n0c y0;
    public final n0c z0;

    static {
        Class<StickerPreviewScreen> cls = StickerPreviewScreen.class;
        k77 khb = new khb(cls, "stickerId", "getStickerId()J", 0);
        n7c n7c = m7c.a;
        E0 = new k77[]{khb, wn6.e(n7c, cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0), wn6.f(cls, "forwardId", "getForwardId()J", 0, n7c), wn6.f(cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0, n7c), wn6.f(cls, "contentContainer", "getContentContainer()Landroid/view/ViewGroup;", 0, n7c), wn6.f(cls, "stickerContainer", "getStickerContainer()Landroid/widget/FrameLayout;", 0, n7c), wn6.f(cls, "favoriteButton", "getFavoriteButton()Lone/me/stickerspreview/IconButtonWithLabel;", 0, n7c), wn6.f(cls, "stickerSetSheetRouter", "getStickerSetSheetRouter()Lcom/bluelinelabs/conductor/Router;", 0, n7c)};
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [java.lang.Object, er7] */
    public StickerPreviewScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        Class<Long> cls = Long.class;
        jr jrVar = new jr(cls, 0L, "arg_key_sticker_id");
        this.a = new jr(cls, 0L, "arg_key_chat_id");
        this.b = new jr(cls, 0L, "arg_key_forward_id");
        this.c = new sy6(3, new up0(3, 1, false));
        this.o = "StickerPreviewScreen";
        this.X = createViewModelLazy(ttd.class, new ypd(3, new mtd(this, 0)));
        this.Y = bvd.a.getAccessor().d(fr7.class);
        this.Z = new Object();
        this.w0 = viewBinding(mca.k);
        this.x0 = viewBinding(mca.d);
        this.y0 = viewBinding(mca.g);
        this.z0 = viewBinding(mca.a);
        this.A0 = Widget.childRouter$default(this, mca.h, (u16) null, 2, (Object) null);
        this.B0 = bm3.C(new mtd(this, 1));
        this.C0 = bm3.C(new mtd(this, 2));
        this.D0 = bm3.C(new mtd(this, 3));
        ttd m0 = m0();
        k77 k77 = E0[0];
        m0.s(((Number) jrVar.a(this)).longValue());
        ttd m02 = m0();
        if (m02.b != 0) {
            qod D = xs7.D(m02.a, m02.c.b(), ru3.b, new ntd(m02, (Continuation) null));
            m02.I0.o1(m02, ttd.L0[1], D);
        }
    }

    public final sy6 getInsetsConfig() {
        return this.c;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m31getScopeIdIluPPks() {
        return this.o;
    }

    public final fr7 l0() {
        return (fr7) this.Y.getValue();
    }

    public final ttd m0() {
        return (ttd) this.X.getValue();
    }

    public final void onActivityPaused(Activity activity) {
        l0().b = null;
        l0().a(this.Z);
    }

    public final void onActivityResumed(Activity activity) {
        WeakReference weakReference;
        if (isAttached()) {
            fr7 l0 = l0();
            er7 er7 = this.Z;
            if (er7 == null) {
                weakReference = null;
            } else {
                l0.getClass();
                weakReference = new WeakReference(er7);
            }
            l0.b = weakReference;
            l0().b(er7);
        }
    }

    public final void onAttach(View view) {
        Window window;
        View currentFocus;
        Activity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null && (currentFocus = window.getCurrentFocus()) != null) {
            currentFocus.clearFocus();
            int i = e87.a;
            if (e87.b(e87.c)) {
                bm3.r(currentFocus);
            }
        }
    }

    public final void onChangeStarted(wr3 wr3, xr3 xr3) {
        super.onChangeStarted(wr3, xr3);
        xr3 xr32 = xr3.X;
        WeakReference weakReference = null;
        er7 er7 = this.Z;
        if (xr3 == xr32 || xr3 == xr3.c) {
            fr7 l0 = l0();
            if (er7 != null) {
                l0.getClass();
                weakReference = new WeakReference(er7);
            }
            l0.b = weakReference;
            l0().b(er7);
        } else if (xr3 == xr3.o || xr3 == xr3.Y) {
            l0().b = null;
            l0().a(er7);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0213  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r23, android.view.ViewGroup r24, android.os.Bundle r25) {
        /*
            r22 = this;
            r0 = r22
            android.widget.FrameLayout r1 = new android.widget.FrameLayout
            android.content.Context r2 = r22.getContext()
            r1.<init>(r2)
            java.lang.String r2 = "#CC000000"
            int r2 = android.graphics.Color.parseColor(r2)
            r1.setBackgroundColor(r2)
            ltd r2 = new ltd
            r3 = 0
            r2.<init>(r0, r3)
            a24.a0(r1, r2)
            az1 r2 = new az1
            android.content.Context r3 = r1.getContext()
            r2.<init>(r3)
            int r3 = defpackage.mca.h
            r2.setId(r3)
            android.widget.FrameLayout$LayoutParams r3 = new android.widget.FrameLayout$LayoutParams
            r4 = -1
            r3.<init>(r4, r4)
            r2.setLayoutParams(r3)
            r1.addView(r2)
            nea r2 = new nea
            android.content.Context r3 = r1.getContext()
            r5 = 6
            r2.<init>(r3, r5)
            int r3 = defpackage.mca.k
            r2.setId(r3)
            r3 = 52
            float r3 = (float) r3
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r3 = r3 * r5
            int r3 = a24.X(r3)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            r5.<init>(r4, r3)
            r6 = 48
            r5.gravity = r6
            r5.topMargin = r3
            r2.setLayoutParams(r5)
            qda r3 = defpackage.qda.a
            r2.setCustomTheme(r3)
            r5 = 0
            r2.setBackground(r5)
            fea r5 = defpackage.fea.a
            r2.setForm(r5)
            wda r5 = new wda
            ljc r6 = new ljc
            r7 = 6
            r6.<init>(r7, r0)
            r5.<init>(r6)
            r2.setLeftActions(r5)
            r1.addView(r2)
            r2 = 160(0xa0, float:2.24E-43)
            float r2 = (float) r2
            android.content.res.Resources r5 = defpackage.dh4.c()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            float r2 = r2 * r5
            int r2 = a24.X(r2)
            android.widget.FrameLayout r5 = new android.widget.FrameLayout
            android.content.Context r6 = r1.getContext()
            r5.<init>(r6)
            int r6 = defpackage.mca.d
            r5.setId(r6)
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r7 = -2
            r6.<init>(r4, r7)
            r8 = 17
            r6.gravity = r8
            r5.setLayoutParams(r6)
            android.widget.FrameLayout r6 = new android.widget.FrameLayout
            android.content.Context r8 = r5.getContext()
            r6.<init>(r8)
            int r8 = defpackage.mca.g
            r6.setId(r8)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r4, r2)
            r6.setLayoutParams(r8)
            r5.addView(r6)
            k77[] r4 = E0
            r6 = 1
            r8 = r4[r6]
            jr r8 = r0.a
            java.lang.Object r9 = r8.a(r0)
            java.lang.Number r9 = (java.lang.Number) r9
            long r9 = r9.longValue()
            r11 = 0
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 <= 0) goto L_0x00e4
            r9 = r6
            goto L_0x00e5
        L_0x00e4:
            r9 = 0
        L_0x00e5:
            jr r13 = r0.b
            r14 = 2
            r10 = 20
            r15 = 120(0x78, float:1.68E-43)
            if (r9 == 0) goto L_0x0170
            xn6 r9 = new xn6
            android.content.Context r11 = r5.getContext()
            r9.<init>(r11)
            int r11 = defpackage.mca.c
            r9.setId(r11)
            float r11 = (float) r15
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r11 = r11 * r12
            int r11 = a24.X(r11)
            android.widget.FrameLayout$LayoutParams r12 = new android.widget.FrameLayout$LayoutParams
            r12.<init>(r11, r7)
            r12.gravity = r6
            float r6 = (float) r10
            android.content.res.Resources r18 = defpackage.dh4.c()
            android.util.DisplayMetrics r10 = r18.getDisplayMetrics()
            float r10 = r10.density
            int r6 = defpackage.me4.c(r6, r10, r2)
            r12.topMargin = r6
            r6 = r4[r14]
            java.lang.Object r6 = r13.a(r0)
            java.lang.Number r6 = (java.lang.Number) r6
            long r20 = r6.longValue()
            r16 = 0
            int r6 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r6 <= 0) goto L_0x0137
            goto L_0x0149
        L_0x0137:
            r6 = 60
            float r10 = (float) r6
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r11 = a24.X(r10)
        L_0x0149:
            r12.leftMargin = r11
            r9.setLayoutParams(r12)
            int r6 = defpackage.phc.T0
            r9.setIcon(r6)
            int r6 = defpackage.nca.d
            r9.setLabel(r6)
            u0a r6 = defpackage.u0a.a
            one.me.sdk.uikit.common.button.OneMeButton r10 = r9.b
            r10.setMode(r6)
            s0a r6 = defpackage.s0a.X
            r10.setAppearance(r6)
            ltd r6 = new ltd
            r10 = 2
            r6.<init>(r0, r10)
            a24.a0(r9, r6)
            r5.addView(r9)
        L_0x0170:
            xn6 r6 = new xn6
            android.content.Context r9 = r5.getContext()
            r6.<init>(r9)
            int r9 = defpackage.mca.a
            r6.setId(r9)
            android.widget.FrameLayout$LayoutParams r9 = new android.widget.FrameLayout$LayoutParams
            float r10 = (float) r15
            android.content.res.Resources r11 = defpackage.dh4.c()
            android.util.DisplayMetrics r11 = r11.getDisplayMetrics()
            float r11 = r11.density
            float r11 = r11 * r10
            int r11 = a24.X(r11)
            r9.<init>(r11, r7)
            r11 = 1
            r9.gravity = r11
            r11 = 20
            float r11 = (float) r11
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r12 = defpackage.me4.c(r11, r12, r2)
            r9.topMargin = r12
            r12 = r4[r14]
            java.lang.Object r12 = r13.a(r0)
            java.lang.Number r12 = (java.lang.Number) r12
            long r18 = r12.longValue()
            r15 = 0
            int r12 = (r18 > r15 ? 1 : (r18 == r15 ? 0 : -1))
            if (r12 <= 0) goto L_0x01bc
            goto L_0x01e0
        L_0x01bc:
            r12 = 1
            r17 = r4[r12]
            java.lang.Object r8 = r8.a(r0)
            java.lang.Number r8 = (java.lang.Number) r8
            long r17 = r8.longValue()
            int r8 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x01e0
            r8 = 60
            float r8 = (float) r8
            android.content.res.Resources r12 = defpackage.dh4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            float r8 = r8 * r12
            int r8 = a24.X(r8)
            goto L_0x01e1
        L_0x01e0:
            r8 = 0
        L_0x01e1:
            r9.rightMargin = r8
            r6.setLayoutParams(r9)
            int r8 = defpackage.phc.K
            r6.setIcon(r8)
            int r8 = defpackage.nca.a
            r6.setLabel(r8)
            one.me.sdk.uikit.common.button.OneMeButton r8 = r6.b
            r8.setCustomTheme(r3)
            ltd r8 = new ltd
            r9 = 3
            r8.<init>(r0, r9)
            a24.a0(r6, r8)
            r5.addView(r6)
            r4 = r4[r14]
            java.lang.Object r4 = r13.a(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            long r8 = r4.longValue()
            r12 = 0
            int r4 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r4 <= 0) goto L_0x0268
            xn6 r4 = new xn6
            android.content.Context r6 = r5.getContext()
            r4.<init>(r6)
            int r6 = defpackage.mca.b
            r4.setId(r6)
            android.content.res.Resources r6 = defpackage.dh4.c()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            float r6 = r6.density
            float r10 = r10 * r6
            int r6 = a24.X(r10)
            android.widget.FrameLayout$LayoutParams r8 = new android.widget.FrameLayout$LayoutParams
            r8.<init>(r6, r7)
            r7 = 1
            r8.gravity = r7
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            int r2 = defpackage.me4.c(r11, r7, r2)
            r8.topMargin = r2
            r8.rightMargin = r6
            r4.setLayoutParams(r8)
            int r2 = defpackage.phc.Z1
            r4.setIcon(r2)
            int r2 = defpackage.nca.b
            r4.setLabel(r2)
            one.me.sdk.uikit.common.button.OneMeButton r2 = r4.b
            r2.setCustomTheme(r3)
            ltd r2 = new ltd
            r3 = 1
            r2.<init>(r0, r3)
            a24.a0(r4, r2)
            r5.addView(r4)
        L_0x0268:
            r1.addView(r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: one.me.stickerspreview.StickerPreviewScreen.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView(View view) {
        l0().b = null;
        this.Z.b();
        smc smc = smc.Y;
        this.B0.b = smc;
        this.C0.b = smc;
        this.D0.b = smc;
    }

    public final void onViewCreated(View view) {
        k77[] k77Arr = E0;
        k77 k77 = k77Arr[7];
        n0c n0c = this.A0;
        if (!((sgc) n0c.T0(this, k77)).n()) {
            StickerSetBottomSheet stickerSetBottomSheet = new StickerSetBottomSheet(this.o, (x54) null);
            stickerSetBottomSheet.y0 = this.Z;
            ((sgc) n0c.T0(this, k77Arr[7])).R(n06.f(stickerSetBottomSheet, (wr3) null, (wr3) null));
        }
        ez3.N(new ck5(m0().C0, new kbb(2, this, StickerPreviewScreen.class, "handleNewSticker", "handleNewSticker(Lone/me/sdk/stickers/model/StickerModel;)V", 4, 5), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().E0, new kbb(2, (nea) this.w0.T0(this, k77Arr[3]), nea.class, "setTitle", "setTitle(Ljava/lang/CharSequence;)V", 4, 6), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().z0, new kbb(2, this, StickerPreviewScreen.class, "handleNavEvent", "handleNavEvent(Lone/me/sdk/arch/event/NavigationEvent;)V", 4, 7), 5), getViewLifecycleScope());
        ez3.N(new ck5(m0().A0, new kbb(2, this, StickerPreviewScreen.class, "handleEvent", "handleEvent(Lone/me/sdk/arch/event/Event;)V", 4, 8), 5), getViewLifecycleScope());
    }

    public StickerPreviewScreen(long j, long j2, long j3) {
        this(jjd.j(new wia[]{new wia("arg_key_sticker_id", Long.valueOf(j)), new wia("arg_key_chat_id", Long.valueOf(j2)), new wia("arg_key_forward_id", Long.valueOf(j3))}));
    }
}
