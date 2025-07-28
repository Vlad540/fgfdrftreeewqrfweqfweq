package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;

/* renamed from: an1  reason: default package */
public final class an1 extends FrameLayout implements pka {
    public static final /* synthetic */ int D0 = 0;
    public final t97 A0 = ez3.O(3, new nl1(2, this));
    public boolean B0;
    public boolean C0;
    public final r7e a = new r7e(new di1(18));
    public final Handler b = new Handler(Looper.getMainLooper());
    public TextureViewRenderer c;
    public ym1 o;
    public s16 w0;
    public hze x0;
    public boolean y0;
    public t8f z0;

    public an1(Context context) {
        super(context, (AttributeSet) null, 0);
        f5f videoLayoutUpdatesController;
        setClipChildren(false);
        setClipToPadding(false);
        addOnLayoutChangeListener(new mp0(3, this));
        if (isLaidOut() && this.c != null && (videoLayoutUpdatesController = getVideoLayoutUpdatesController()) != null) {
            videoLayoutUpdatesController.a(this, this.z0);
        }
    }

    public static void a(an1 an1) {
        an1.b.post(an1.getUpdateWhenReadyRunnable());
    }

    private final FrameLayout.LayoutParams getParams() {
        if (this.B0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            return layoutParams;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams2.gravity = 17;
        return layoutParams2;
    }

    private final Runnable getUpdateWhenReadyRunnable() {
        return (Runnable) this.A0.getValue();
    }

    private final qka getVideoController() {
        return (qka) this.a.getValue();
    }

    /* access modifiers changed from: private */
    public final f5f getVideoLayoutUpdatesController() {
        s16 s16 = this.w0;
        if (s16 != null) {
            return (f5f) s16.invoke();
        }
        return null;
    }

    public final void c() {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            t8f t8f = this.z0;
            if (t8f != null) {
                ((rka) getVideoController()).removeParticipantView(t8f.b, textureViewRenderer);
            }
            f5f videoLayoutUpdatesController = getVideoLayoutUpdatesController();
            if (videoLayoutUpdatesController != null) {
                videoLayoutUpdatesController.c(textureViewRenderer);
            }
            ((rka) getVideoController()).releaseParticipantView(textureViewRenderer);
            removeAllViews();
        }
        ym1 ym1 = this.o;
        if (ym1 != null) {
            ym1.a(false);
        }
        this.z0 = null;
        this.c = null;
        this.C0 = false;
        this.b.removeCallbacks(getUpdateWhenReadyRunnable());
        ((rka) getVideoController()).X.remove(this);
    }

    /* JADX WARNING: type inference failed for: r4v3, types: [l7c, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r5 != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d() {
        /*
            r8 = this;
            hze r0 = r8.x0
            boolean r1 = r8.y0
            r2 = 0
            if (r0 != 0) goto L_0x0008
            goto L_0x0023
        L_0x0008:
            boolean r3 = r0.b
            boolean r4 = r0.g
            if (r3 == 0) goto L_0x0011
            if (r4 == 0) goto L_0x0011
            goto L_0x0023
        L_0x0011:
            t8f r3 = r0.d
            boolean r5 = r0.c
            if (r1 == 0) goto L_0x001b
            if (r5 == 0) goto L_0x001b
        L_0x0019:
            r2 = r3
            goto L_0x0023
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            t8f r2 = r0.h
            goto L_0x0023
        L_0x0020:
            if (r5 == 0) goto L_0x0023
            goto L_0x0019
        L_0x0023:
            r1 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0031
            boolean r4 = r0.e
            if (r4 == 0) goto L_0x0031
            boolean r0 = r0.f
            if (r0 == 0) goto L_0x0031
            r0 = r1
            goto L_0x0032
        L_0x0031:
            r0 = r3
        L_0x0032:
            if (r2 == 0) goto L_0x003a
            boolean r4 = r2.a
            if (r4 == 0) goto L_0x003a
            r4 = r1
            goto L_0x003b
        L_0x003a:
            r4 = r3
        L_0x003b:
            if (r0 == 0) goto L_0x0041
            if (r4 == 0) goto L_0x0041
            r0 = r1
            goto L_0x0042
        L_0x0041:
            r0 = r3
        L_0x0042:
            if (r0 == 0) goto L_0x0101
            if (r2 == 0) goto L_0x00f5
            t8f r4 = r8.z0
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r5 = r2.b
            if (r4 != 0) goto L_0x004d
            goto L_0x007e
        L_0x004d:
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r6 = r8.c
            if (r6 == 0) goto L_0x007e
            f5f r7 = r8.getVideoLayoutUpdatesController()
            if (r7 == 0) goto L_0x005a
            r7.c(r6)
        L_0x005a:
            boolean r7 = r4.equals(r2)
            if (r7 != 0) goto L_0x0075
            qka r7 = r8.getVideoController()
            rka r7 = (defpackage.rka) r7
            r7.getClass()
            ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey r4 = r4.b
            r7.removeParticipantView(r4, r6)
            qka r4 = r8.getVideoController()
            r4.setParticipantView(r5, r6)
        L_0x0075:
            f5f r4 = r8.getVideoLayoutUpdatesController()
            if (r4 == 0) goto L_0x007e
            r4.a(r6, r2)
        L_0x007e:
            l7c r4 = new l7c
            r4.<init>()
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r6 = r8.c
            r4.a = r6
            if (r6 != 0) goto L_0x00f2
            qka r6 = r8.getVideoController()
            android.content.Context r7 = r8.getContext()
            rka r6 = (defpackage.rka) r6
            ru.ok.android.externcalls.sdk.ui.RendererView r6 = r6.createVideoViewInstance(r7)
            r4.a = r6
            android.view.View r6 = (android.view.View) r6
            android.widget.FrameLayout$LayoutParams r7 = r8.getParams()
            r8.addView(r6, r3, r7)
            qka r6 = r8.getVideoController()
            java.lang.Object r7 = r4.a
            ru.ok.android.externcalls.sdk.ui.RendererView r7 = (ru.ok.android.externcalls.sdk.ui.RendererView) r7
            r6.setParticipantView(r5, r7)
            f5f r5 = r8.getVideoLayoutUpdatesController()
            if (r5 == 0) goto L_0x00ba
            java.lang.Object r6 = r4.a
            android.view.View r6 = (android.view.View) r6
            r5.a(r6, r2)
        L_0x00ba:
            java.lang.Object r5 = r4.a
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r5 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r5
            r8.c = r5
            boolean r5 = r8.isLaidOut()
            if (r5 == 0) goto L_0x00dc
            boolean r5 = r8.isLayoutRequested()
            if (r5 != 0) goto L_0x00dc
            f5f r5 = r8.getVideoLayoutUpdatesController()
            if (r5 == 0) goto L_0x00e5
            java.lang.Object r6 = r4.a
            android.view.View r6 = (android.view.View) r6
            t8f r7 = r8.z0
            r5.a(r6, r7)
            goto L_0x00e5
        L_0x00dc:
            zm1 r5 = new zm1
            r6 = 0
            r5.<init>(r8, r6, r4)
            r8.addOnLayoutChangeListener(r5)
        L_0x00e5:
            java.lang.Object r4 = r4.a
            ru.ok.android.externcalls.sdk.ui.TextureViewRenderer r4 = (ru.ok.android.externcalls.sdk.ui.TextureViewRenderer) r4
            bk r5 = new bk
            r6 = 4
            r5.<init>(r6, r8)
            r4.setFrameSizeListener(r5)
        L_0x00f2:
            r8.z0 = r2
            goto L_0x0104
        L_0x00f5:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x0101:
            r8.c()
        L_0x0104:
            ym1 r2 = r8.o
            if (r2 == 0) goto L_0x0113
            boolean r4 = r8.C0
            if (r4 == 0) goto L_0x010f
            if (r0 == 0) goto L_0x010f
            goto L_0x0110
        L_0x010f:
            r1 = r3
        L_0x0110:
            r2.a(r1)
        L_0x0113:
            qka r0 = r8.getVideoController()
            rka r0 = (defpackage.rka) r0
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = r0.X
            r0.add(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.an1.d():void");
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
        f5f videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.a(this, this.z0);
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5f videoLayoutUpdatesController = getVideoLayoutUpdatesController();
        if (videoLayoutUpdatesController != null) {
            videoLayoutUpdatesController.c(this);
        }
        c();
    }

    public final void setFullScreen(boolean z) {
        TextureViewRenderer textureViewRenderer = this.c;
        if (textureViewRenderer != null) {
            ViewGroup.LayoutParams layoutParams = textureViewRenderer.getLayoutParams();
            if (layoutParams != null) {
                setLayoutParams(getParams());
                textureViewRenderer.setLayoutParams(layoutParams);
            } else {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
        }
        this.B0 = z;
    }

    public final void setListener(ym1 ym1) {
        this.o = ym1;
    }

    public final void setVideoLayoutUpdatesControllerProvider(s16 s16) {
        this.w0 = s16;
    }
}
