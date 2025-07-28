package defpackage;

import android.animation.ObjectAnimator;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.incoming.CallIncomingScreen;
import one.me.chats.search.ChatsListSearchScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.edit.FolderEditScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.main.MainScreen;
import one.me.profile.screens.media.ChatMediaTabWidget;

/* renamed from: vz0  reason: default package */
public final /* synthetic */ class vz0 extends x26 implements s16 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vz0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke() {
        grd grd;
        Object value;
        vye vye = vye.c;
        qg9 qg9 = null;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((f03) this.receiver).g.getBoolean("app.calls_sdk.logging.webrtc", false));
            case 1:
                p71 p71 = (p71) this.receiver;
                ((ep1) p71.X).w(fe6.c);
                do {
                    grd = p71.x0;
                    value = grd.getValue();
                    n71 n71 = (n71) value;
                } while (!grd.b(value, new m71(false)));
                return jue;
            case 2:
                CallIncomingScreen callIncomingScreen = (CallIncomingScreen) this.receiver;
                mk9 mk9 = CallIncomingScreen.Z;
                String[] strArr = qna.h;
                if (!((qna) callIncomingScreen.o.getValue()).b(strArr)) {
                    iq1 iq1 = (iq1) callIncomingScreen.X.getValue();
                    ep1 ep1 = (ep1) callIncomingScreen.a;
                    String str = ep1.k().c;
                    boolean z = ep1.k().h;
                    iq1.getClass();
                    iq1.c(iq1, "REQUEST_PERMISSION_MIC", str, "BEFORE_JOIN", (Integer) null, (String) null, (String) null, z, 56);
                    qna qna = (qna) callIncomingScreen.o.getValue();
                    jrf jrf = (jrf) callIncomingScreen.Y.getValue();
                    int i = r1a.E;
                    qna.getClass();
                    int i2 = iub.permissions_audio_title;
                    int i3 = baa.g;
                    if (qna.i(jrf, strArr)) {
                        jrf.c(strArr, 160, i2, i, i3);
                    } else {
                        qna.f(jrf, strArr, 160);
                    }
                } else {
                    callIncomingScreen.l0().q();
                }
                return jue;
            case 3:
                ((aj1) this.receiver).c.m(vye);
                return jue;
            case 4:
                ((aj1) this.receiver).c.m(vye);
                return jue;
            case 5:
                y22 y22 = (y22) this.receiver;
                return ez3.z(ez3.J(new zi1(new ik5(((bv2) y22.c.getValue()).m(y22.b), 2), 5), ((pae) y22.X.getValue()).b()));
            case 6:
                return ChatMediaTabWidget.l0((ChatMediaTabWidget) this.receiver);
            case 7:
                return ((di2) this.receiver).s();
            case 8:
                return ((di2) this.receiver).s();
            case 9:
                k77[] k77Arr = ChatsListSearchScreen.N0;
                int ordinal = ((js2) ((ChatsListSearchScreen) this.receiver).m0().J0.a.getValue()).a.ordinal();
                return (ordinal == 3 || ordinal == 4) ? mnc.C0 : mnc.B0;
            case 10:
                return kh3.B((kh3) this.receiver);
            case 11:
                return kh3.y((kh3) this.receiver);
            case 12:
                kh3 kh3 = (kh3) this.receiver;
                kh3.getClass();
                bf3 bf3 = new bf3();
                bf3.c(kh3);
                int id = kh3.L0.getId();
                bf3.d(id, 3, 0, 3);
                bf3.d(id, 4, 0, 4);
                bf3.d(id, 6, 0, 6);
                new hw9(bf3, 6, id, 4).e(0);
                bf3.d(id, 7, 0, 7);
                new hw9(bf3, 7, id, 4).e(0);
                bf3.g(id).d.l0 = true;
                return bf3;
            case 13:
                return kh3.C((kh3) this.receiver);
            case 14:
                return kh3.F((kh3) this.receiver);
            case 15:
                return kh3.A((kh3) this.receiver);
            case 16:
                return kh3.G((kh3) this.receiver);
            case 17:
                return kh3.I((kh3) this.receiver);
            case 18:
                return kh3.J((kh3) this.receiver);
            case 19:
                kh3 kh32 = (kh3) this.receiver;
                kh32.getClass();
                bf3 bf32 = new bf3();
                bf32.c(kh32);
                t97 t97 = kh32.T0;
                boolean L = ek8.L(t97);
                mz9 mz9 = kh32.K0;
                if (L) {
                    og0 og0 = new og0(((AppCompatCheckBox) t97.getValue()).getId(), 4, (Object) bf32);
                    og0.G(0);
                    og0.e(0);
                    og0.D(0);
                    og0.q(mz9.getId());
                }
                og0 og02 = new og0(mz9.getId(), 4, (Object) bf32);
                og02.G(0);
                og02.e(0);
                if (ek8.L(t97)) {
                    hr1.q((float) 12, dh4.c().getDisplayMetrics().density, og02.C(((AppCompatCheckBox) t97.getValue()).getId()));
                } else {
                    og02.D(0);
                }
                return bf32;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                ((jo3) this.receiver).P();
                return jue;
            case 21:
                ((jo3) this.receiver).P();
                return jue;
            case 22:
                return Boolean.valueOf(((f03) this.receiver).g.getBoolean("app.disable_in_app_review_time_condition", false));
            case 23:
                return Boolean.valueOf(((f03) this.receiver).g.getBoolean("app.enable_in_app_review_not_from_market_build", false));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return Boolean.valueOf(((f03) this.receiver).g.getBoolean("web_app:ssl_check", false));
            case 25:
                rq5 m0 = ((FolderEditScreen) ((np5) this.receiver)).m0();
                m0.F0.o1(m0, rq5.H0[0], xs7.D(m0.a, m0.o.a(), ru3.b, new jq5(m0, (Continuation) null)));
                return jue;
            case 26:
                return Boolean.valueOf(((AtomicBoolean) this.receiver).get());
            case 27:
                MainScreen mainScreen = (MainScreen) this.receiver;
                j06 j06 = MainScreen.Z;
                m0a m0a = mainScreen.q0().o;
                sgc o0 = mainScreen.o0();
                if (o0 == null) {
                    return mainScreen.p0();
                }
                qg9 g = o0.g(m0a.d);
                if (g instanceof rg9) {
                    qg9 = (rg9) g;
                }
                return qg9 == null ? mainScreen.p0() : qg9.o();
            case 28:
                MainScreen mainScreen2 = (MainScreen) this.receiver;
                j06 j062 = MainScreen.Z;
                m0a m0a2 = mainScreen2.q0().o;
                sgc o02 = mainScreen2.o0();
                if (o02 == null) {
                    return eja.e;
                }
                qg9 g2 = o02.g(m0a2.d);
                if (g2 instanceof qg9) {
                    qg9 = g2;
                }
                return qg9 == null ? eja.e : ((ChatsTabWidget) qg9).q0();
            default:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator = mediaKeyboardWidget.E0;
                if ((objectAnimator == null || !objectAnimator.isRunning()) && mediaKeyboardWidget.m0().getTranslationY() != 0.0f) {
                    ObjectAnimator objectAnimator2 = mediaKeyboardWidget.E0;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mediaKeyboardWidget.m0(), View.TRANSLATION_Y, new float[]{mediaKeyboardWidget.m0().getTranslationY(), 0.0f});
                    ofFloat.setDuration(200);
                    ofFloat.start();
                    mediaKeyboardWidget.E0 = ofFloat;
                }
                return jue;
        }
    }
}
