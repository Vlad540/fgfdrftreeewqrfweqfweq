package defpackage;

import android.text.Editable;
import android.text.Spannable;
import android.text.style.ClickableSpan;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import java.lang.ref.WeakReference;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.chatmedia.viewer.video.VideoViewerWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.zoom.ZoomableDraweeView;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.messages.contacts.profile.FrgContactAvatar;
import ru.ok.messages.media.attaches.AttachPhotoView;
import ru.ok.messages.media.attaches.fragments.FrgAttachPhoto;
import ru.ok.messages.media.mediabar.LocalPhotoView;
import ru.ok.messages.views.fragments.FrgProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* renamed from: tz  reason: default package */
public final class tz extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tz(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        WeakReference weakReference;
        View view;
        switch (this.a) {
            case 4:
                sm1 sm1 = (sm1) this.b;
                pm1 pm1 = sm1.f1;
                if (pm1 != null) {
                    pm1.y(sm1.l1);
                }
                return sm1.f1 != null;
            case 5:
                afc afc = ((yz2) this.b).d;
                if (afc == null || (weakReference = (WeakReference) afc.a) == null || (view = (View) weakReference.get()) == null) {
                    return false;
                }
                GestureDetector.OnDoubleTapListener onDoubleTapListener = view instanceof GestureDetector.OnDoubleTapListener ? (GestureDetector.OnDoubleTapListener) view : null;
                if (onDoubleTapListener != null) {
                    return onDoubleTapListener.onDoubleTap(motionEvent);
                }
                return false;
            case 6:
                jn jnVar = (jn) this.b;
                int i = jnVar.b;
                if (i == 0) {
                    int i2 = i + 1;
                    jnVar.b = i2;
                    sj4 sj4 = (sj4) jnVar.c;
                    if (sj4 != null) {
                        sj4.c(i2);
                    }
                }
                return true;
            case 8:
                yj4 yj4 = (yj4) this.b;
                int i3 = yj4.c;
                if (i3 == 0) {
                    int i4 = i3 + 1;
                    yj4.c = i4;
                    xj4 xj4 = yj4.a;
                    if (xj4 != null) {
                        xj4.c(i4);
                    }
                }
                return true;
            case 11:
                oz6 oz6 = (j76) this.b;
                float currentScale = oz6.getCurrentScale() * ((float) Math.pow((double) (oz6.getMaxScale() / oz6.getMinScale()), (double) (1.0f / ((float) oz6.a1))));
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (currentScale > oz6.getMaxScale()) {
                    currentScale = oz6.getMaxScale();
                }
                float currentScale2 = oz6.getCurrentScale();
                nz6 nz6 = new nz6(oz6, currentScale2, currentScale - currentScale2, x, y);
                oz6.O0 = nz6;
                oz6.post(nz6);
                return super.onDoubleTap(motionEvent);
            case LangUtils.HASH_SEED:
                float x2 = motionEvent.getX();
                xvf xvf = (xvf) this.b;
                xvf.i = x2;
                xvf.j = motionEvent.getY();
                xvf.k = 1;
                return true;
            case 18:
                ((ZoomableDraweeView) this.b).I0.a(motionEvent.getX(), motionEvent.getY());
                return true;
            default:
                return super.onDoubleTap(motionEvent);
        }
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 5:
                return false;
            default:
                return super.onDoubleTapEvent(motionEvent);
        }
    }

    public boolean onDown(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            case 4:
                return true;
            case 5:
                yz2 yz2 = (yz2) this.b;
                yz2.g = false;
                Spannable spannable = yz2.e;
                if (spannable == null) {
                    return false;
                }
                yz2.f = yz2.a(yz2, yz2.d, spannable, motionEvent);
                return yz2.f != null;
            case 9:
                return true;
            case 10:
                return true;
            case 13:
                jq8 jq8 = (jq8) this.b;
                Editable text = jq8.c.getText();
                if (text == null) {
                    return false;
                }
                aq8.a.onTouchEvent(jq8.c, text, motionEvent);
                return false;
            case Protos.Attaches.Attach.DAILY_MEDIA:
                return true;
            case 18:
                return true;
            default:
                return super.onDown(motionEvent);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLongPress(android.view.MotionEvent r11) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.b
            int r1 = r10.a
            switch(r1) {
                case 3: goto L_0x00ba;
                case 4: goto L_0x009f;
                case 5: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            super.onLongPress(r11)
            return
        L_0x000b:
            yz2 r0 = (defpackage.yz2) r0
            afc r10 = r0.d
            if (r10 != 0) goto L_0x0013
            goto L_0x009e
        L_0x0013:
            android.text.Spannable r1 = r0.e
            if (r1 != 0) goto L_0x0019
            goto L_0x009e
        L_0x0019:
            int r2 = r1.length()
            if (r2 != 0) goto L_0x0021
            goto L_0x009e
        L_0x0021:
            android.text.style.ClickableSpan r4 = defpackage.yz2.a(r0, r10, r1, r11)
            boolean r10 = r4 instanceof android.text.style.URLSpan
            if (r10 == 0) goto L_0x0036
            sf7 r10 = defpackage.sf7.a
            r2 = r4
            android.text.style.URLSpan r2 = (android.text.style.URLSpan) r2
            java.lang.String r2 = r2.getURL()
            r0.c = r2
        L_0x0034:
            r8 = r10
            goto L_0x007f
        L_0x0036:
            boolean r10 = r4 instanceof defpackage.lf7
            if (r10 == 0) goto L_0x0044
            sf7 r10 = defpackage.sf7.Y
            r2 = r4
            lf7 r2 = (defpackage.lf7) r2
            java.lang.String r2 = r2.b
            r0.c = r2
            goto L_0x0034
        L_0x0044:
            boolean r10 = r4 instanceof defpackage.ip8
            if (r10 == 0) goto L_0x0071
            r10 = r4
            ip8 r10 = (defpackage.ip8) r10
            fp8 r10 = r10.a
            ep8 r2 = r10.c
            ep8 r3 = defpackage.ep8.a
            if (r2 != r3) goto L_0x009e
            sf7 r2 = defpackage.sf7.X
            int r10 = r10.e
            r10 = r4
            ip8 r10 = (defpackage.ip8) r10     // Catch:{ all -> 0x009e }
            fp8 r10 = r10.a     // Catch:{ all -> 0x009e }
            int r10 = r10.d     // Catch:{ all -> 0x009e }
            r3 = r4
            ip8 r3 = (defpackage.ip8) r3     // Catch:{ all -> 0x009e }
            fp8 r3 = r3.a     // Catch:{ all -> 0x009e }
            int r3 = r3.e     // Catch:{ all -> 0x009e }
            java.lang.CharSequence r10 = r1.subSequence(r10, r3)     // Catch:{ all -> 0x009e }
            java.lang.String r10 = r10.toString()     // Catch:{ all -> 0x009e }
            r0.c = r10     // Catch:{ all -> 0x009e }
            r8 = r2
            goto L_0x007f
        L_0x0071:
            boolean r10 = r4 instanceof defpackage.efb
            if (r10 == 0) goto L_0x009e
            sf7 r10 = defpackage.sf7.X
            r2 = r4
            efb r2 = (defpackage.efb) r2
            java.lang.String r2 = r2.a
            r0.c = r2
            goto L_0x0034
        L_0x007f:
            r0.f = r4
            java.lang.String r7 = r0.c
            if (r7 != 0) goto L_0x0086
            goto L_0x009e
        L_0x0086:
            int r10 = r7.length()
            if (r10 != 0) goto L_0x008d
            goto L_0x009e
        L_0x008d:
            int r5 = r1.getSpanStart(r4)
            int r6 = r1.getSpanEnd(r4)
            xz2 r3 = r0.a
            r9 = r11
            r3.e(r4, r5, r6, r7, r8, r9)
            r10 = 1
            r0.g = r10
        L_0x009e:
            return
        L_0x009f:
            sm1 r0 = (sm1) r0
            pm1 r10 = r0.f1
            if (r10 == 0) goto L_0x00b9
            le1 r0 = r0.l1
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r11.getRawX()
            int r2 = (int) r2
            float r11 = r11.getRawY()
            int r11 = (int) r11
            r1.<init>(r2, r11)
            r10.v(r0, r1)
        L_0x00b9:
            return
        L_0x00ba:
            gm1 r0 = (gm1) r0
            em1 r10 = r0.j1
            if (r10 == 0) goto L_0x00de
            le1 r0 = r0.m1
            android.graphics.Point r1 = new android.graphics.Point
            float r2 = r11.getX()
            int r2 = (int) r2
            float r11 = r11.getY()
            int r11 = (int) r11
            r1.<init>(r2, r11)
            yg1 r10 = (yg1) r10
            smc r11 = one.me.calls.ui.ui.call.CallScreen.T0
            one.me.calls.ui.ui.call.CallScreen r10 = r10.a
            aj1 r10 = r10.z0()
            r10.x(r0, r1)
        L_0x00de:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tz.onLongPress(android.view.MotionEvent):void");
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        switch (this.a) {
            case 11:
                ((j76) this.b).g(-f, -f2);
                return true;
            default:
                return super.onScroll(motionEvent, motionEvent2, f, f2);
        }
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [ru.ok.messages.media.attaches.AttachPhotoView, android.view.View] */
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        uz uzVar;
        pg1 pg1;
        s16 s16;
        WeakReference weakReference;
        sj4 sj4;
        xj4 xj4;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                ? r2 = (AttachPhotoView) obj;
                if (!r2.N0.e(r2.getMeasuredWidth() / 2, r2.getMeasuredHeight() / 2, motionEvent) && (uzVar = r2.M0) != null) {
                    ((FrgAttachPhoto) uzVar).F1(r2.U0);
                }
                return true;
            case 2:
                w51 w51 = (w51) obj;
                wwc wwc = w51.N0;
                if (!(wwc == null || (pg1 = ((r51) wwc.b).S0) == null)) {
                    smc smc = CallScreen.T0;
                    CallScreen callScreen = pg1.a;
                    if (callScreen.z0().q(callScreen.u0().g)) {
                        CallScreen.o0(callScreen);
                    }
                }
                return w51.N0 != null;
            case 3:
                gm1 gm1 = (gm1) obj;
                yg1 yg1 = gm1.j1;
                if (yg1 != null) {
                    smc smc2 = CallScreen.T0;
                    CallScreen callScreen2 = yg1.a;
                    if (callScreen2.z0().q(callScreen2.u0().g)) {
                        CallScreen.o0(callScreen2);
                    }
                }
                return gm1.j1 != null;
            case 4:
                sm1 sm1 = (sm1) obj;
                pm1 pm1 = sm1.f1;
                if (pm1 != null) {
                    pm1.G(sm1.l1);
                }
                return sm1.f1 != null;
            case 5:
                yz2 yz2 = (yz2) obj;
                afc afc = yz2.d;
                View view = (afc == null || (weakReference = (WeakReference) afc.a) == null) ? null : (View) weakReference.get();
                ClickableSpan clickableSpan = yz2.f;
                if (clickableSpan == null || view == null) {
                    yz2.g = false;
                    if (!(clickableSpan != null || view == null || (s16 = yz2.h) == null)) {
                        if (s16 != null) {
                            s16.invoke();
                        }
                        yz2.d = null;
                    }
                } else {
                    if (!yz2.g) {
                        clickableSpan.onClick(view);
                    }
                    yz2.d = null;
                    yz2.f = null;
                    yz2.e = null;
                    yz2.c = null;
                    yz2.g = false;
                }
                return true;
            case 6:
                jn jnVar = (jn) obj;
                if (jnVar.b == 0 && (sj4 = (sj4) jnVar.c) != null) {
                    sj4.b();
                }
                return true;
            case 7:
                ygd ygd = (ygd) ((vj4) obj).e;
                ygd.getClass();
                k77[] k77Arr = VideoViewerWidget.y0;
                ChatMediaViewerScreen n0 = ((VideoViewerWidget) ygd.a).n0();
                if (n0 != null) {
                    n0.E0(true);
                }
                return super.onSingleTapConfirmed(motionEvent);
            case 8:
                yj4 yj4 = (yj4) obj;
                if (yj4.c == 0 && (xj4 = yj4.a) != null) {
                    xj4.b();
                }
                return true;
            case 9:
                FrgContactAvatar frgContactAvatar = (FrgContactAvatar) obj;
                if (frgContactAvatar.M1) {
                    frgContactAvatar.M1 = false;
                } else if (frgContactAvatar.s1() != null) {
                    frgContactAvatar.s1().e();
                }
                return true;
            case 10:
                FrgProfilePhoto frgProfilePhoto = (FrgProfilePhoto) obj;
                if (frgProfilePhoto.s1() != null) {
                    frgProfilePhoto.s1().e();
                }
                return true;
            case Protos.Attaches.Attach.PRESENT:
                int i = LocalPhotoView.M0;
                udd.n("ru.ok.messages.media.mediabar.LocalPhotoView", "onSingleTapConfirmed");
                ql7 ql7 = ((LocalPhotoView) obj).L0;
                if (ql7 != null) {
                    ql7.b();
                }
                return true;
            case Protos.Attaches.Attach.LOCATION:
                se9 se9 = ((id9) obj).y0;
                if (se9 != null) {
                    se9.o(new ai0(18));
                }
                return super.onSingleTapConfirmed(motionEvent);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                rpa rpa = ((spa) obj).M0;
                if (rpa != null) {
                    rpa.i();
                }
                return true;
            default:
                return super.onSingleTapConfirmed(motionEvent);
        }
    }

    /* JADX WARNING: type inference failed for: r14v15, types: [eda, android.view.View] */
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        xw6 xw6;
        Object obj = this.b;
        switch (this.a) {
            case 1:
                ku0 ku0 = (ku0) obj;
                iu0 iu0 = ku0.D0;
                yt0 yt0 = ku0.E0;
                eu0 eu0 = ku0.F0;
                if (!(iu0 == null || yt0 == null || eu0 == null || yt0.w0)) {
                    yw6 yw6 = (yw6) iu0;
                    n14 n14 = yw6.y0;
                    n14.getClass();
                    if (n14.b) {
                        n14.b = false;
                        vw6 vw6 = yw6.o;
                        if (!(vw6 == null || (xw6 = yw6.x0) == null)) {
                            long j = yw6.c;
                            k77[] k77Arr = MessagesListWidget.b1;
                            zz8 t0 = ((MessagesListWidget) ((ss8) xw6).b).t0();
                            qod D = xs7.D(t0.a, t0.Y.b(), ru3.b, new dy8(yt0, t0, j, vw6, eu0, (Continuation) null));
                            t0.p1.o1(t0, zz8.I1[5], D);
                        }
                        yw6.postDelayed(new re(13, (gz3) n14.c), n14.a);
                    }
                }
                ku0.E0 = null;
                ku0.F0 = null;
                ku0.invalidate();
                return true;
            case 5:
                yz2 yz2 = (yz2) obj;
                if (!yz2.i) {
                    onSingleTapConfirmed(motionEvent);
                } else {
                    Runnable runnable = yz2.j;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
                return false;
            case 6:
                jn jnVar = (jn) obj;
                int i = jnVar.b;
                if (i > 0) {
                    int i2 = i + 1;
                    jnVar.b = i2;
                    sj4 sj4 = (sj4) jnVar.c;
                    if (sj4 != null) {
                        sj4.c(i2);
                    }
                }
                return true;
            case 8:
                yj4 yj4 = (yj4) obj;
                int i3 = yj4.c;
                if (i3 > 0) {
                    int i4 = i3 + 1;
                    yj4.c = i4;
                    xj4 xj4 = yj4.a;
                    if (xj4 != null) {
                        xj4.c(i4);
                    }
                }
                return true;
            case 13:
                jq8 jq8 = (jq8) obj;
                Editable text = jq8.c.getText();
                if (text != null) {
                    aq8.a.onTouchEvent(jq8.c, text, motionEvent);
                }
                return false;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                n7d n7d = (n7d) obj;
                if (!n7d.T0.a() || ((eda) n7d.T0.getValue()).isEnabled()) {
                    return false;
                }
                k7d k7d = n7d.W0;
                if (k7d != null) {
                    k7d.T(n7d.getModelItem().getItemId());
                }
                return true;
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }
}
