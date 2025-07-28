package defpackage;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.chats.search.views.ClearRecentSearchBottomSheet;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* renamed from: e78  reason: default package */
public final /* synthetic */ class e78 extends x26 implements s16 {
    public final /* synthetic */ int a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e78(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    public final Object invoke() {
        tf3 k;
        dq8 dq8 = dq8.a;
        eq8 eq8 = eq8.a;
        sgc sgc = null;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                MediaKeyboardWidget mediaKeyboardWidget = (MediaKeyboardWidget) this.receiver;
                ObjectAnimator objectAnimator = mediaKeyboardWidget.E0;
                if ((objectAnimator == null || !objectAnimator.isRunning()) && mediaKeyboardWidget.m0().getTranslationY() != ((float) mediaKeyboardWidget.m0().getHeight())) {
                    ObjectAnimator objectAnimator2 = mediaKeyboardWidget.E0;
                    if (objectAnimator2 != null) {
                        objectAnimator2.cancel();
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mediaKeyboardWidget.m0(), View.TRANSLATION_Y, new float[]{mediaKeyboardWidget.m0().getTranslationY(), (float) mediaKeyboardWidget.m0().getHeight()});
                    ofFloat.setDuration(200);
                    ofFloat.start();
                    mediaKeyboardWidget.E0 = ofFloat;
                }
                return jue;
            case 1:
                MessageWriteWidget messageWriteWidget = (MessageWriteWidget) this.receiver;
                k77[] k77Arr = MessageWriteWidget.J0;
                messageWriteWidget.X.f.k = messageWriteWidget.p0().getText();
                messageWriteWidget.u0().K0.m((Object) null, new pg9());
                return jue;
            case 2:
                MessageWriteWidget messageWriteWidget2 = (MessageWriteWidget) this.receiver;
                if (!ek8.L(messageWriteWidget2.B0) || (!hhd.f(messageWriteWidget2.p0().getSendActionState(), eq8) && !hhd.f(messageWriteWidget2.p0().getSendActionState(), dq8))) {
                    CharSequence text = messageWriteWidget2.p0().getText();
                    if ((text == null || text.length() == 0) && messageWriteWidget2.p0().getEmojiExpandableState() != zp8.a) {
                        nu8.z(messageWriteWidget2.u0(), 0, 3);
                    } else {
                        messageWriteWidget2.z0();
                    }
                } else {
                    messageWriteWidget2.x0();
                }
                return jue;
            case 3:
                MessageWriteWidget messageWriteWidget3 = (MessageWriteWidget) this.receiver;
                k77[] k77Arr2 = MessageWriteWidget.J0;
                CharSequence text2 = messageWriteWidget3.p0().getText();
                if ((text2 != null && !h0e.c0(text2)) || messageWriteWidget3.u0().t()) {
                    if (!ek8.L(messageWriteWidget3.B0) || (!hhd.f(messageWriteWidget3.p0().getSendActionState(), eq8) && !hhd.f(messageWriteWidget3.p0().getSendActionState(), dq8))) {
                        messageWriteWidget3.u0().B(text2, true);
                        messageWriteWidget3.p0().setText((CharSequence) null);
                    } else {
                        messageWriteWidget3.x0();
                    }
                }
                return jue;
            case 4:
                i22 i22 = (i22) ((nu8) this.receiver).b.getValue();
                if (!(i22 == null || (k = i22.k()) == null)) {
                    long n = k.n();
                    mt8 mt8 = mt8.c;
                    Long valueOf = Long.valueOf(i22.a);
                    d34 P1 = mt8.P1();
                    mn mnVar = new mn(12);
                    mnVar.b = ":webapp:root";
                    mnVar.T(Long.valueOf(n), "bot_id");
                    mnVar.T("start_button", "entry_point");
                    mnVar.T(valueOf, "chat_id");
                    P1.c(mnVar.u(), (Bundle) null);
                }
                return jue;
            case 5:
                ((ex9) this.receiver).f();
                return jue;
            case 6:
                ((ex9) this.receiver).f();
                return jue;
            case 7:
                return Boolean.valueOf(((f03) this.receiver).g.getBoolean("app.debug.profile.info.enabled", false));
            case 8:
                ygc ygc = ((es2) this.receiver).a;
                bm3.p(ygc);
                k77[] k77Arr3 = BottomSheetWidget.B0;
                BottomSheetWidget clearRecentSearchBottomSheet = new ClearRecentSearchBottomSheet();
                clearRecentSearchBottomSheet.setTargetController(ygc);
                ygc ygc2 = ygc;
                while (ygc2.getParentController() != null) {
                    ygc2 = ygc2.getParentController();
                }
                ygc ygc3 = ygc2 instanceof ygc ? ygc2 : null;
                if (ygc3 != null) {
                    sgc = ygc3.S();
                }
                clearRecentSearchBottomSheet.y0(ygc);
                if (sgc != null) {
                    vgc vgc = new vgc(clearRecentSearchBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                }
                return jue;
            case 9:
                v4d v4d = (v4d) this.receiver;
                String str = ((u9d) v4d.D0.getValue()).b;
                l05 l05 = v4d.B0;
                if (str == null) {
                    taf.o(l05, m8d.b);
                } else {
                    Long t = v4d.t();
                    if (t != null) {
                        taf.o(l05, new q8d(t.longValue()));
                    }
                }
                return jue;
            case 10:
                v4d v4d2 = (v4d) this.receiver;
                ap3 ap3 = (ap3) v4d2.c.a.getValue();
                di3 di3 = ap3.a;
                tf3 i = di3.i(di3.h.a.s(), false);
                if (i == null) {
                    i = ap3.a(((Number) ap3.b.getValue()).longValue());
                }
                taf.o(v4d2.C0, new v7d(i.g(), new hge(zaa.v)));
                return jue;
            case 11:
                v4d v4d3 = (v4d) this.receiver;
                ap3 ap32 = (ap3) v4d3.c.a.getValue();
                di3 di32 = ap32.a;
                tf3 i2 = di32.i(di32.h.a.s(), false);
                if (i2 == null) {
                    i2 = ap32.a(((Number) ap32.b.getValue()).longValue());
                }
                taf.o(v4d3.C0, new v7d(us8.i(i2.o(), "+"), new hge(zaa.w)));
                return jue;
            case 12:
                k87 k87 = (k87) this.receiver;
                k87.getClass();
                b87 b87 = b87.c;
                long j = k87.b.getLong("arg_key_chat_id");
                d34 P12 = b87.P1();
                P12.b(":stickers/search?chat_id=" + j, (Bundle) null);
                return jue;
            case 13:
                k87 k872 = (k87) this.receiver;
                k872.getClass();
                k77[] k77Arr4 = KeyboardStickersWidget.x0;
                rr3 rr3 = k872.a;
                rr3.getClass();
                k77[] k77Arr5 = BottomSheetWidget.B0;
                jc3 c = rf0.c(y5a.o, 6, (Bundle) null);
                c.a(new kc3[]{new kc3(x5a.g, new hge(y5a.m), 1, false), new kc3(x5a.h, new hge(y5a.n), 2, false)});
                ConfirmationBottomSheet e = c.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc4 = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc4 != null) {
                    sgc = ygc4.S();
                }
                e.y0(rr3);
                if (sgc != null) {
                    vgc vgc2 = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc2, true, "BottomSheetWidget");
                    sgc.G(vgc2);
                }
                return jue;
            case 14:
                y6e y6e = (y6e) this.receiver;
                y6e.f = false;
                y6e.g = -1.0f;
                y6e.h = -1.0f;
                return jue;
            case 15:
                ((q4e) this.receiver).close();
                return jue;
            case 16:
                return Boolean.valueOf(((f03) this.receiver).g.getBoolean("app.toggle.webapp_fullscreen", false));
            case 17:
                zgf s = ((kmf) this.receiver).s();
                xs7.E(s.c, s.e().a(), (ru3) null, new egf(s, (Continuation) null), 2);
                return jue;
            case 18:
                zgf s2 = ((kmf) this.receiver).s();
                s2.getClass();
                xs7.E(s2.c, (hu3) null, (ru3) null, new dgf(s2, (Continuation) null), 3);
                return jue;
            case 19:
                WebAppRootScreen webAppRootScreen = (WebAppRootScreen) this.receiver;
                k77[] k77Arr6 = WebAppRootScreen.K0;
                webAppRootScreen.getClass();
                uld uld = uld.Z;
                k77 k77 = WebAppRootScreen.K0[1];
                return new eja(uld, Long.valueOf(((Number) webAppRootScreen.x0.a(webAppRootScreen)).longValue()), 3);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                anf anf = (anf) this.receiver;
                xs7.E(anf.a, ((pae) anf.w0.getValue()).b(), (ru3) null, new ymf(anf, (Continuation) null), 2);
                return jue;
            case 21:
                ((anf) this.receiver).getClass();
                return jue;
            default:
                ((Runnable) this.receiver).run();
                return jue;
        }
    }
}
