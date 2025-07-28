package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.os.Looper;
import android.text.TextPaint;
import one.me.chats.forward.ForwardPickerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.folders.list.FoldersListScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.login.inputname.InputNameScreen;
import one.me.login.inputphone.InputPhoneScreen;

/* renamed from: fs5  reason: default package */
public final /* synthetic */ class fs5 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ fs5(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<pae> cls = pae.class;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                k77[] k77Arr = FoldersListScreen.Z;
                return mnc.q1;
            case 1:
                k77[] k77Arr2 = FoldersListScreen.Z;
                return new os5();
            case 2:
                k77[] k77Arr3 = ForwardPickerScreen.M0;
                return qda.a;
            case 3:
                k77[] k77Arr4 = ForwardPickerScreen.M0;
                return mnc.W0;
            case 4:
                k77[] k77Arr5 = ForwardPickerScreen.M0;
                return jue;
            case 5:
                k77[] k77Arr6 = ForwardPickerScreen.M0;
                return new u68((f87) null, 15);
            case 6:
                return jue;
            case 7:
                return Looper.getMainLooper().getThread();
            case 8:
                return new p7c("width=\"(\\d+)", 0);
            case 9:
                return new p7c("height=\"(\\d+)", 0);
            case 10:
                Paint paint = new Paint();
                paint.setStyle(Paint.Style.FILL);
                return paint;
            case 11:
                return new TextPaint();
            case 12:
                k77[] k77Arr7 = xp6.N0;
                return jue;
            case 13:
                return new mq6();
            case 14:
                return new bhd(false);
            case 15:
                return new bhd(true);
            case 16:
                k77[] k77Arr8 = InputNameScreen.F0;
                return mnc.Y;
            case 17:
                k77[] k77Arr9 = InputPhoneScreen.I0;
                return mnc.o;
            case 18:
                k77[] k77Arr10 = InputPhoneScreen.I0;
                ko7 ko7 = ko7.a;
                ko7.getClass();
                return new ly6(new r7e(new ib7(5)), ko7.getAccessor().d(cls), ko7.getAccessor().d(ed3.class));
            case 19:
                return new bhd(false);
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return new bhd(true);
            case 21:
                k77[] k77Arr11 = InviteByPhoneScreen.F0;
                return mnc.z0;
            case 22:
                k77[] k77Arr12 = InviteByPhoneScreen.F0;
                return new r17();
            case 23:
                k77[] k77Arr13 = InviteByPhoneScreen.F0;
                return new ak3(x07.a.getAccessor().d(xzc.class));
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                k77[] k77Arr14 = InviteByQrBottomSheet.I0;
                return new w17();
            case 25:
                return new j1f(200);
            case 26:
                return new j1f(200);
            case 27:
                k77[] k77Arr15 = KeyboardEmojiWidget.w0;
                t77 t77 = t77.a;
                return new uv4(t77.getAccessor().d(gj.class), (ji) t77.getAccessor().c(ji.class), new c9(13, (wv4) t77.getAccessor().c(wv4.class)), (pae) t77.getAccessor().c(cls), (v2c) t77.getAccessor().d(v2c.class).getValue());
            case 28:
                k77[] k77Arr16 = KeyboardStickersWidget.x0;
                t77 t772 = t77.a;
                return new wed(t772.getAccessor().d(zsd.class), t772.getAccessor().d(lwd.class));
            default:
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(dh4.c().getDisplayMetrics().density * 10.0f);
                gradientDrawable.setShape(0);
                return gradientDrawable;
        }
    }
}
