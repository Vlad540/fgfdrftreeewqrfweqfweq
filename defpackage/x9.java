package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.gallery.MediaGalleryWidget;
import one.me.sdk.gallery.selectalbum.SelectAlbumWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.sdk.messagewrite.mention.SuggestionsWidget;
import one.me.stickerspreview.set.StickerSetBottomSheet;

/* renamed from: x9  reason: default package */
public class x9 extends t0b {
    public final /* synthetic */ int a;
    public final /* synthetic */ Widget b;

    public x9(Widget widget, int i) {
        this.a = i;
        this.b = widget;
    }

    public int a() {
        switch (this.a) {
            case 0:
                return c();
            case 1:
                return c();
            case 2:
                return 0;
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) this.b;
                rzb rzb = messageContextMenuBottomSheet.T0;
                if (rzb != null && rzb.c.j() > 8) {
                    return c();
                }
                if (messageContextMenuBottomSheet.C0()) {
                    return 0;
                }
                return c();
            case 4:
                return 0;
            case 5:
                return StickerSetBottomSheet.w0((StickerSetBottomSheet) this.b);
            default:
                return 0;
        }
    }

    /* JADX WARNING: type inference failed for: r1v19, types: [android.view.View, ty4] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b6, code lost:
        r1 = r1.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            one.me.sdk.arch.Widget r2 = r6.b
            int r3 = r6.a
            switch(r3) {
                case 0: goto L_0x0158;
                case 1: goto L_0x0142;
                case 2: goto L_0x0124;
                case 3: goto L_0x008e;
                case 4: goto L_0x008d;
                case 5: goto L_0x0088;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r6 = r6.e()
            int r0 = r6 / 2
            k77[] r3 = one.me.sdk.messagewrite.mention.SuggestionsWidget.F0
            one.me.sdk.messagewrite.mention.SuggestionsWidget r2 = (one.me.sdk.messagewrite.mention.SuggestionsWidget) r2
            e3e r3 = r2.A0()
            t0c r3 = r3.H0
            zqd r3 = r3.a
            java.lang.Object r3 = r3.getValue()
            q2e r3 = (defpackage.q2e) r3
            e3e r4 = r2.A0()
            grd r5 = r4.K0
            java.lang.Object r5 = r5.getValue()
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            grd r4 = r4.L0
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            r4.intValue()
            if (r5 == 0) goto L_0x0087
            boolean r4 = h0e.c0(r5)
            if (r4 == 0) goto L_0x0041
            goto L_0x0087
        L_0x0041:
            if (r3 == 0) goto L_0x0045
            java.util.List r1 = r3.b
        L_0x0045:
            if (r1 == 0) goto L_0x006d
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x004e
            goto L_0x006d
        L_0x004e:
            r1 = 20
            float r1 = (float) r1
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            int r6 = defpackage.me4.p(r1, r3, r6)
            ty4 r1 = r2.z0()
            int r1 = r1.getMeasuredHeight()
            int r6 = r6 - r1
            int r6 = java.lang.Math.max(r6, r0)
            goto L_0x0087
        L_0x006d:
            androidx.appcompat.widget.AppCompatTextView r0 = r2.y0()
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 - r0
            r0 = 48
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r6 = defpackage.me4.p(r0, r1, r6)
        L_0x0087:
            return r6
        L_0x0088:
            int r6 = r6.e()
            return r6
        L_0x008d:
            return r0
        L_0x008e:
            k77[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.d1
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r2 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r2
            boolean r3 = r2.C0()
            if (r3 == 0) goto L_0x00df
            r6 = 350(0x15e, float:4.9E-43)
            float r6 = (float) r6
            android.content.res.Resources r3 = defpackage.dh4.c()
            android.util.DisplayMetrics r3 = r3.getDisplayMetrics()
            float r3 = r3.density
            float r6 = r6 * r3
            int r6 = a24.X(r6)
            androidx.recyclerview.widget.RecyclerView r3 = r2.S0
            if (r3 == 0) goto L_0x00b4
            r4 = -9223372036854775808
            b7c r1 = r3.N(r4)
        L_0x00b4:
            if (r1 == 0) goto L_0x00bf
            android.view.View r1 = r1.a
            if (r1 == 0) goto L_0x00bf
            int r1 = r1.getMeasuredHeight()
            goto L_0x00c0
        L_0x00bf:
            r1 = r0
        L_0x00c0:
            r3 = 120(0x78, float:1.68E-43)
            float r3 = (float) r3
            android.content.res.Resources r4 = defpackage.dh4.c()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            float r4 = r4.density
            int r1 = defpackage.me4.c(r3, r4, r1)
            androidx.recyclerview.widget.RecyclerView r3 = r2.S0
            if (r3 == 0) goto L_0x00d9
            int r0 = r3.getPaddingBottom()
        L_0x00d9:
            int r1 = r1 + r0
            if (r1 >= r6) goto L_0x00dd
            goto L_0x00fc
        L_0x00dd:
            r6 = r1
            goto L_0x00fc
        L_0x00df:
            android.view.ViewGroup r0 = r2.R0
            if (r0 == 0) goto L_0x00e8
            int r6 = r0.getMeasuredHeight()
            goto L_0x00f0
        L_0x00e8:
            android.view.View r6 = r6.f()
            int r6 = r6.getMeasuredHeight()
        L_0x00f0:
            int r0 = r2.c1
            int r6 = r6 + r0
            android.view.ViewGroup r0 = r2.A0()
            int r0 = r0.getPaddingBottom()
            int r6 = r6 + r0
        L_0x00fc:
            int r0 = defpackage.e87.a
            int r0 = defpackage.e87.c
            boolean r0 = defpackage.e87.b(r0)
            if (r0 == 0) goto L_0x0119
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            int r0 = r0 - r6
            android.content.Context r6 = r2.getContext()
            int r6 = defpackage.e87.a(r6)
            int r6 = r6 + r0
            goto L_0x0123
        L_0x0119:
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            int r6 = r0 - r6
        L_0x0123:
            return r6
        L_0x0124:
            k77[] r6 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            one.me.chatscreen.mediabar.MediaBarWidget r2 = (one.me.chatscreen.mediabar.MediaBarWidget) r2
            android.widget.LinearLayout r6 = r2.s0()
            int r6 = r6.getMeasuredHeight()
            r0 = 405(0x195, float:5.68E-43)
            float r0 = (float) r0
            android.content.res.Resources r1 = defpackage.dh4.c()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            float r1 = r1.density
            int r6 = defpackage.me4.p(r0, r1, r6)
            return r6
        L_0x0142:
            bqc r6 = one.me.sdk.bottomsheet.BaseBottomSheetWidget.X
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r2 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r2
            android.view.View r6 = r2.requireView()
            int r6 = r6.getMeasuredHeight()
            android.view.View r0 = r2.o0()
            int r0 = r0.getMeasuredHeight()
            int r6 = r6 - r0
            return r6
        L_0x0158:
            k77[] r0 = one.me.sdk.messagewrite.markdown.AddLinkBottomSheet.A0
            one.me.sdk.messagewrite.markdown.AddLinkBottomSheet r2 = (one.me.sdk.messagewrite.markdown.AddLinkBottomSheet) r2
            android.view.View r0 = r2.requireView()
            int r0 = r0.getMeasuredHeight()
            android.view.View r6 = r6.f()
            int r6 = r6.getMeasuredHeight()
            int r0 = r0 - r6
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9.c():int");
    }

    public View d() {
        switch (this.a) {
            case 2:
                k77[] k77Arr = MediaBarWidget.h1;
                return this.b.q0();
            default:
                return super.d();
        }
    }

    /* JADX WARNING: type inference failed for: r2v9, types: [gwc, android.view.View] */
    public final int e() {
        int i = 0;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                View view = ((AddLinkBottomSheet) mediaBarWidget).getView();
                if (view != null) {
                    return view.getMeasuredHeight();
                }
                return 0;
            case 1:
                View view2 = ((BaseBottomSheetWidget) mediaBarWidget).getView();
                if (view2 != null) {
                    return view2.getMeasuredHeight();
                }
                return 0;
            case 2:
                k77[] k77Arr = MediaBarWidget.h1;
                return mediaBarWidget.s0().getMeasuredHeight();
            case 3:
                View view3 = ((MessageContextMenuBottomSheet) mediaBarWidget).getView();
                if (view3 != null) {
                    return view3.getMeasuredHeight();
                }
                return 0;
            case 4:
                k77[] k77Arr2 = SelectAlbumWidget.Y;
                return -((SelectAlbumWidget) mediaBarWidget).l0().getMeasuredHeight();
            case 5:
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) mediaBarWidget;
                View view4 = stickerSetBottomSheet.getView();
                if (view4 != null) {
                    i = view4.getMeasuredHeight();
                }
                return i - stickerSetBottomSheet.C0;
            default:
                k77[] k77Arr3 = SuggestionsWidget.F0;
                return ((SuggestionsWidget) mediaBarWidget).o0().getMeasuredHeight();
        }
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [gwc, android.view.View] */
    public final View f() {
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = AddLinkBottomSheet.A0;
                return ((AddLinkBottomSheet) mediaBarWidget).o0();
            case 1:
                return ((BaseBottomSheetWidget) mediaBarWidget).o0();
            case 2:
                k77[] k77Arr2 = MediaBarWidget.h1;
                return mediaBarWidget.s0();
            case 3:
                k77[] k77Arr3 = MessageContextMenuBottomSheet.d1;
                return ((MessageContextMenuBottomSheet) mediaBarWidget).o0();
            case 4:
                k77[] k77Arr4 = SelectAlbumWidget.Y;
                return ((SelectAlbumWidget) mediaBarWidget).l0();
            case 5:
                k77[] k77Arr5 = StickerSetBottomSheet.E0;
                return ((StickerSetBottomSheet) mediaBarWidget).o0();
            default:
                k77[] k77Arr6 = SuggestionsWidget.F0;
                return ((SuggestionsWidget) mediaBarWidget).o0();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if (r0.A0().E0.a.getValue() == p3b.b) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0057, code lost:
        if (r0.u0().n() != false) goto L_0x006f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r0.A0().u() != false) goto L_0x006e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0073  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.x0b g(defpackage.x0b r4, defpackage.x0b r5) {
        /*
            r3 = this;
            one.me.sdk.arch.Widget r0 = r3.b
            int r3 = r3.a
            switch(r3) {
                case 1: goto L_0x0081;
                case 2: goto L_0x0024;
                case 3: goto L_0x0018;
                case 4: goto L_0x0007;
                case 5: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            return r5
        L_0x0008:
            x0b r3 = defpackage.x0b.a
            if (r5 != r3) goto L_0x0013
            x0b r0 = defpackage.x0b.c
            if (r4 != r0) goto L_0x0013
            x0b r4 = defpackage.x0b.b
            goto L_0x0017
        L_0x0013:
            if (r5 != r3) goto L_0x0016
            goto L_0x0017
        L_0x0016:
            r4 = r5
        L_0x0017:
            return r4
        L_0x0018:
            x0b r3 = defpackage.x0b.a
            if (r5 != r3) goto L_0x0023
            k77[] r3 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.d1
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r0 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r0
            r0.getClass()
        L_0x0023:
            return r5
        L_0x0024:
            x0b r3 = defpackage.x0b.c
            one.me.chatscreen.mediabar.MediaBarWidget r0 = (one.me.chatscreen.mediabar.MediaBarWidget) r0
            if (r5 != r3) goto L_0x003d
            k77[] r1 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            i08 r1 = r0.A0()
            t0c r1 = r1.E0
            zqd r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            p3b r2 = p3b.b
            if (r1 != r2) goto L_0x003d
            goto L_0x006f
        L_0x003d:
            if (r4 != r3) goto L_0x005a
            x0b r3 = defpackage.x0b.b
            if (r5 != r3) goto L_0x005a
            int r3 = defpackage.e87.a
            int r3 = defpackage.e87.c
            boolean r3 = defpackage.e87.b(r3)
            if (r3 != 0) goto L_0x006f
            k77[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            sgc r3 = r0.u0()
            boolean r3 = r3.n()
            if (r3 == 0) goto L_0x005a
            goto L_0x006f
        L_0x005a:
            r5.getClass()
            x0b r3 = defpackage.x0b.a
            if (r5 == r3) goto L_0x0062
            goto L_0x006e
        L_0x0062:
            k77[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            i08 r3 = r0.A0()
            boolean r3 = r3.u()
            if (r3 == 0) goto L_0x006f
        L_0x006e:
            r4 = r5
        L_0x006f:
            x0b r3 = defpackage.x0b.a
            if (r4 != r3) goto L_0x0080
            k77[] r3 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            i08 r3 = r0.A0()
            rz7 r5 = rz7.a
            l05 r3 = r3.A0
            defpackage.taf.o(r3, r5)
        L_0x0080:
            return r4
        L_0x0081:
            x0b r3 = defpackage.x0b.a
            if (r5 != r3) goto L_0x008d
            one.me.sdk.bottomsheet.BaseBottomSheetWidget r0 = (one.me.sdk.bottomsheet.BaseBottomSheetWidget) r0
            boolean r3 = r0.q0()
            if (r3 == 0) goto L_0x008e
        L_0x008d:
            r4 = r5
        L_0x008e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9.g(x0b, x0b):x0b");
    }

    public void h() {
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 0:
                k77[] k77Arr = AddLinkBottomSheet.A0;
                ((AddLinkBottomSheet) mediaBarWidget).s0();
                return;
            case 1:
                ((BaseBottomSheetWidget) mediaBarWidget).s0();
                return;
            case 2:
                k77[] k77Arr2 = MediaBarWidget.h1;
                MediaBarWidget mediaBarWidget2 = mediaBarWidget;
                mediaBarWidget2.o0();
                i08 A0 = mediaBarWidget2.A0();
                A0.x0.n(uy7.a);
                taf.o(A0.A0, qz7.a);
                ChatScreen chatScreen = mediaBarWidget2.g1;
                if (chatScreen != null) {
                    chatScreen.o.l();
                    return;
                }
                return;
            case 3:
                k77[] k77Arr3 = MessageContextMenuBottomSheet.d1;
                ((MessageContextMenuBottomSheet) mediaBarWidget).s0();
                return;
            case 4:
                k77[] k77Arr4 = SelectAlbumWidget.Y;
                qvc n0 = ((SelectAlbumWidget) mediaBarWidget).n0();
                taf.o(n0.o, hvc.a);
                return;
            case 6:
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) mediaBarWidget;
                suggestionsWidget.getRouter().B(suggestionsWidget);
                return;
            default:
                return;
        }
    }

    public void i() {
        switch (this.a) {
            case 2:
                k77[] k77Arr = MediaBarWidget.h1;
                i08 A0 = this.b.A0();
                taf.o(A0.A0, rz7.a);
                return;
            default:
                return;
        }
    }

    public boolean j() {
        switch (this.a) {
            case 2:
                k77[] k77Arr = MediaBarWidget.h1;
                return this.b.A0().u();
            default:
                return super.j();
        }
    }

    public void k() {
        switch (this.a) {
            case 2:
                k77[] k77Arr = MediaBarWidget.h1;
                this.b.p0();
                return;
            default:
                return;
        }
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [android.view.View, ty4] */
    public void l(x0b x0b) {
        switch (this.a) {
            case 6:
                boolean z = x0b == x0b.c;
                k77[] k77Arr = SuggestionsWidget.F0;
                SuggestionsWidget suggestionsWidget = (SuggestionsWidget) this.b;
                suggestionsWidget.w0().setVisibility(z ? 0 : 8);
                suggestionsWidget.x0().setVisibility(z ^ true ? 0 : 8);
                ? z0 = suggestionsWidget.z0();
                ViewGroup.LayoutParams layoutParams = z0.getLayoutParams();
                if (layoutParams != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    marginLayoutParams.topMargin = a24.X((z ? (float) 0 : (float) 20) * dh4.c().getDisplayMetrics().density);
                    z0.setLayoutParams(marginLayoutParams);
                    AppCompatTextView y0 = suggestionsWidget.y0();
                    ViewGroup.LayoutParams layoutParams2 = y0.getLayoutParams();
                    if (layoutParams2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.topMargin = a24.X((z ? (float) 0 : (float) 8) * dh4.c().getDisplayMetrics().density);
                        y0.setLayoutParams(marginLayoutParams2);
                        n0c n0c = suggestionsWidget.x0;
                        if (z) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) n0c.T0(suggestionsWidget, SuggestionsWidget.F0[1]);
                            constraintLayout.setClipToOutline(true);
                            constraintLayout.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 0.0f));
                            return;
                        }
                        ConstraintLayout constraintLayout2 = (ConstraintLayout) n0c.T0(suggestionsWidget, SuggestionsWidget.F0[1]);
                        constraintLayout2.setClipToOutline(true);
                        constraintLayout2.setOutlineProvider(new eu3(dh4.c().getDisplayMetrics().density * 20.0f));
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            default:
                return;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: android.view.ViewGroup} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void m(int r12) {
        /*
            r11 = this;
            r0 = 1
            r1 = 1065353216(0x3f800000, float:1.0)
            r2 = 4
            r3 = 0
            r4 = 0
            one.me.sdk.arch.Widget r5 = r11.b
            int r6 = r11.a
            switch(r6) {
                case 2: goto L_0x010a;
                case 3: goto L_0x0066;
                case 4: goto L_0x0047;
                case 5: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            return
        L_0x000e:
            k77[] r11 = one.me.stickerspreview.set.StickerSetBottomSheet.E0
            one.me.stickerspreview.set.StickerSetBottomSheet r5 = (one.me.stickerspreview.set.StickerSetBottomSheet) r5
            rr3 r11 = r5.getParentController()
            boolean r0 = r11 instanceof defpackage.aud
            if (r0 == 0) goto L_0x001d
            aud r11 = (defpackage.aud) r11
            goto L_0x001e
        L_0x001d:
            r11 = r3
        L_0x001e:
            if (r11 == 0) goto L_0x002f
            one.me.stickerspreview.StickerPreviewScreen r11 = (one.me.stickerspreview.StickerPreviewScreen) r11
            k77[] r0 = one.me.stickerspreview.StickerPreviewScreen.E0
            r0 = r0[r2]
            n0c r1 = r11.x0
            java.lang.Object r11 = r1.T0(r11, r0)
            r3 = r11
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
        L_0x002f:
            if (r3 != 0) goto L_0x0032
            goto L_0x0046
        L_0x0032:
            int r11 = r3.getBottom()
            if (r12 > r11) goto L_0x0043
            float r11 = (float) r12
            int r12 = r3.getBottom()
            float r12 = (float) r12
            float r11 = r11 - r12
            r3.setTranslationY(r11)
            goto L_0x0046
        L_0x0043:
            r3.setTranslationY(r4)
        L_0x0046:
            return
        L_0x0047:
            k77[] r0 = one.me.sdk.gallery.selectalbum.SelectAlbumWidget.Y
            one.me.sdk.gallery.selectalbum.SelectAlbumWidget r5 = (one.me.sdk.gallery.selectalbum.SelectAlbumWidget) r5
            qvc r0 = r5.n0()
            android.view.View r11 = r11.f()
            int r11 = r11.getMeasuredHeight()
            int r11 = r11 + r12
            r0.getClass()
            fvc r12 = new fvc
            r12.<init>(r11)
            l05 r11 = r0.o
            defpackage.taf.o(r11, r12)
            return
        L_0x0066:
            k77[] r11 = one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet.d1
            one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet r5 = (one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet) r5
            boolean r11 = r5.isAttached()
            if (r11 == 0) goto L_0x0109
            boolean r11 = r5.C0()
            if (r11 != 0) goto L_0x0078
            goto L_0x0109
        L_0x0078:
            float r11 = (float) r12
            r12 = 76
            float r12 = (float) r12
            android.content.res.Resources r2 = defpackage.dh4.c()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            float r12 = r12 * r2
            int r12 = a24.X(r12)
            float r12 = (float) r12
            float r11 = r11 / r12
            float r11 = gwf.i(r11, r4, r1)
            int r12 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r12 != 0) goto L_0x009c
            android.view.ViewGroup r12 = r5.A0()
            r12.getMeasuredHeight()
        L_0x009c:
            int r12 = defpackage.h9a.c
            android.view.View r12 = r5.findViewById(r12)
            nea r12 = (defpackage.nea) r12
            if (r12 == 0) goto L_0x00e9
            float r0 = (float) r0
            float r0 = r0 - r11
            r12.setAlpha(r0)
            int r12 = r12.getMeasuredHeight()
            float r12 = (float) r12
            float r0 = r0 * r12
            int r12 = (int) r0
            androidx.recyclerview.widget.RecyclerView r0 = r5.S0
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r0 == 0) goto L_0x00cc
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            if (r2 == 0) goto L_0x00c6
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            r2.topMargin = r12
            r0.setLayoutParams(r2)
            goto L_0x00cc
        L_0x00c6:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r1)
            throw r11
        L_0x00cc:
            android.view.ViewGroup r12 = r5.A0()
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            if (r0 == 0) goto L_0x00e3
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.c1
            float r1 = (float) r1
            float r1 = r1 * r11
            int r1 = (int) r1
            r0.topMargin = r1
            r12.setLayoutParams(r0)
            goto L_0x00e9
        L_0x00e3:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            r11.<init>(r1)
            throw r11
        L_0x00e9:
            r12 = 1101004800(0x41a00000, float:20.0)
            float r12 = r12 * r11
            android.content.res.Resources r0 = defpackage.dh4.c()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r12 = r12 * r0
            tp0 r0 = r5.b1
            r0.b = r12
            android.view.ViewGroup r12 = r5.A0()
            r12.invalidateOutline()
            sm4 r12 = r5.x0
            if (r12 == 0) goto L_0x0109
            r12.setAlpha(r11)
        L_0x0109:
            return
        L_0x010a:
            k77[] r11 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            one.me.chatscreen.mediabar.MediaBarWidget r5 = (one.me.chatscreen.mediabar.MediaBarWidget) r5
            r5.getClass()
            float r11 = (float) r12
            r6 = 48
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r6 = a24.X(r6)
            float r6 = (float) r6
            float r6 = r11 / r6
            float r1 = gwf.i(r6, r4, r1)
            android.view.View r4 = r5.requireView()
            android.view.WindowInsets r4 = r4.getRootWindowInsets()
            r6 = 0
            if (r4 == 0) goto L_0x0144
            nsf r3 = nsf.f(r3, r4)
            lsf r3 = r3.a
            r4 = 7
            qy6 r3 = r3.f(r4)
            int r3 = r3.b
            goto L_0x0145
        L_0x0144:
            r3 = r6
        L_0x0145:
            k77[] r4 = one.me.chatscreen.mediabar.MediaBarWidget.h1
            r7 = 5
            r7 = r4[r7]
            nl0 r7 = r5.A0
            java.lang.Object r7 = r7.getValue()
            android.widget.FrameLayout r7 = (android.widget.FrameLayout) r7
            int r7 = r7.getMeasuredHeight()
            int r3 = r3 - r7
            int r3 = r3 - r12
            if (r3 >= 0) goto L_0x015b
            r3 = r6
        L_0x015b:
            android.widget.LinearLayout r7 = r5.s0()
            int r8 = r7.getPaddingLeft()
            int r9 = r7.getPaddingRight()
            int r10 = r7.getPaddingBottom()
            r7.setPadding(r8, r3, r9, r10)
            r3 = 1094713344(0x41400000, float:12.0)
            float r3 = r3 * r1
            android.content.res.Resources r7 = defpackage.dh4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r3 = r3 * r7
            tp0 r7 = r5.P0
            r7.b = r3
            android.widget.LinearLayout r3 = r5.s0()
            r3.invalidateOutline()
            r2 = r4[r2]
            nl0 r2 = r5.z0
            java.lang.Object r2 = r2.getValue()
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setAlpha(r1)
            nea r1 = r5.z0()
            if (r12 > 0) goto L_0x019b
            goto L_0x019c
        L_0x019b:
            r0 = r6
        L_0x019c:
            r1.setShowDropdown(r0)
            r5.J0 = r11
            one.me.chatscreen.mediabar.MediaBarWidget.n0(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.x9.m(int):void");
    }

    /* JADX WARNING: type inference failed for: r5v14, types: [android.view.View, ty4] */
    /* JADX WARNING: type inference failed for: r5v32, types: [gwc, android.view.View] */
    public boolean n(float f, float f2) {
        boolean z;
        b7e b7e;
        RecyclerView recyclerView;
        MediaBarWidget mediaBarWidget = this.b;
        switch (this.a) {
            case 2:
                k77[] k77Arr = MediaBarWidget.h1;
                MediaBarWidget mediaBarWidget2 = mediaBarWidget;
                if (mediaBarWidget2.r0().D0) {
                    return false;
                }
                gba gba = mediaBarWidget2.y0;
                if (gba == null || (b7e = (b7e) gba.a.X) == null) {
                    z = false;
                } else {
                    Rect rect = mcf.a;
                    mcf.d(rect, b7e);
                    z = rect.contains((int) f, (int) f2);
                }
                if (z) {
                    return false;
                }
                if (mediaBarWidget2.y0().getVisibility() == 0) {
                    return false;
                }
                MediaGalleryWidget a2 = mediaBarWidget2.x0().a();
                MediaGalleryWidget mediaGalleryWidget = a2 instanceof MediaGalleryWidget ? a2 : null;
                return !(mediaGalleryWidget != null ? mediaGalleryWidget.l0().canScrollVertically(-1) : false);
            case 3:
                MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) mediaBarWidget;
                rzb rzb = messageContextMenuBottomSheet.T0;
                boolean canScrollVertically = (rzb == null || (recyclerView = rzb.d) == null) ? false : recyclerView.canScrollVertically(-1);
                RecyclerView recyclerView2 = messageContextMenuBottomSheet.S0;
                return !(recyclerView2 != null ? recyclerView2.canScrollVertically(-1) : false) && !canScrollVertically;
            case 4:
                k77[] k77Arr2 = SelectAlbumWidget.Y;
                return !((SelectAlbumWidget) mediaBarWidget).l0().canScrollVertically(1);
            case 5:
                k77[] k77Arr3 = StickerSetBottomSheet.E0;
                StickerSetBottomSheet stickerSetBottomSheet = (StickerSetBottomSheet) mediaBarWidget;
                stickerSetBottomSheet.getClass();
                return ((RecyclerView) stickerSetBottomSheet.A0.T0(stickerSetBottomSheet, StickerSetBottomSheet.E0[2])).computeVerticalScrollOffset() == 0;
            case 6:
                k77[] k77Arr4 = SuggestionsWidget.F0;
                return ((SuggestionsWidget) mediaBarWidget).z0().getLayoutManager().T0() == 0;
            default:
                return super.n(f, f2);
        }
    }
}
