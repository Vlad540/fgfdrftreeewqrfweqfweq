package defpackage;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.media.MediaMetadataRetriever;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.chatscreen.mediabar.permission.MediaBarPermissionWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.login.LoginScreen;
import one.me.mediapicker.MediaPickerScreen;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* renamed from: ib7  reason: default package */
public final /* synthetic */ class ib7 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ ib7(int i) {
        this.a = i;
    }

    public final Object invoke() {
        Class<bd> cls = bd.class;
        Class<yy9> cls2 = yy9.class;
        switch (this.a) {
            case 0:
                return ((a04) nqc.a.getAccessor().c(a04.class)).g;
            case 1:
                return y0f.a.c();
            case 2:
                int i = LinkInterceptorWidget.o;
                return (ff7) o2a.a.getAccessor().c(ff7.class);
            case 3:
                return new MediaMetadataRetriever();
            case 4:
                ko7 ko7 = ko7.a;
                return new gp7(ko7.getAccessor().d(cls2), ko7.getAccessor().d(f03.class), ko7.getAccessor().d(zy9.class), ko7.getAccessor().d(pva.class), ko7.getAccessor().d(bp7.class), ko7.getAccessor().d(wo7.class), ko7.getAccessor().d(ap3.class));
            case 5:
                ko7 ko72 = ko7.a;
                return new h70(ko72.getAccessor().d(cls), ko72.getAccessor().d(cls2));
            case 6:
                ko7 ko73 = ko7.a;
                return new e70(ko73.getAccessor().d(cls), ko73.getAccessor().d(cls2));
            case 7:
                return new a70(ko7.a.getAccessor().d(cls2));
            case 8:
                k77[] k77Arr = LoginScreen.c;
                return new hp7(ko7.a.getAccessor().d(qna.class));
            case 9:
                return new q75(150);
            case 10:
                return new q75(150);
            case 11:
                k77[] k77Arr2 = LogsViewerScreen.Y;
                sp7 sp7 = sp7.a;
                return new kq7((i6a) sp7.getAccessor().c(i6a.class), (pae) sp7.getAccessor().c(pae.class));
            case 12:
                k77[] k77Arr3 = ry7.O0;
                return jue.a;
            case 13:
                k77[] k77Arr4 = MediaBarPermissionWidget.Z;
                return new gz7();
            case 14:
                k77[] k77Arr5 = MediaBarWidget.h1;
                sl2 sl2 = sl2.a;
                Class<knc> cls3 = knc.class;
                return new ykb(new v2b((knc) sl2.getAccessor().c(cls3), sl2.getDispatchers().b(), false, 4), new lkc((knc) sl2.getAccessor().c(cls3), sl2.getDispatchers().b()), (wk7) sl2.getAccessor().c(wk7.class), (bf5) sl2.getAccessor().c(bf5.class), (knc) sl2.getAccessor().c(cls3), (u98) sl2.getAccessor().c(u98.class), sl2.getDispatchers());
            case 15:
                k77[] k77Arr6 = MediaBarWidget.h1;
                return new vg8();
            case 16:
                k77[] k77Arr7 = MediaBarWidget.h1;
                return new qvc((gl7) sl2.a.getAccessor().c(gl7.class), new evc(false, true));
            case 17:
                return new Matrix();
            case 18:
                return new Path();
            case 19:
                return new byte[131072];
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                k77[] k77Arr8 = MediaPickerScreen.F0;
                return mnc.H0;
            case 21:
                k77[] k77Arr9 = MediaPickerScreen.F0;
                return new f56(new ib7(22));
            case 22:
                k77[] k77Arr10 = MediaPickerScreen.F0;
                return Boolean.FALSE;
            case 23:
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setDither(true);
                return paint;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                hw4 hw4 = hw4.a;
                return new tj5(3, new bi8(hw4, hw4));
            case 25:
                float[] fArr = new float[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    fArr[i2] = dh4.c().getDisplayMetrics().density * 16.0f;
                }
                return fArr;
            case 26:
                return new ac3(1);
            case 27:
                return new eg6();
            case 28:
                k77[] k77Arr11 = MessageWriteWidget.J0;
                return qda.a;
            default:
                k77[] k77Arr12 = MessagesSettingsScreen.Y;
                return mnc.u1;
        }
    }
}
