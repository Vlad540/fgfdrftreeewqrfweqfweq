package defpackage;

import android.graphics.Paint;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import java.util.concurrent.CopyOnWriteArraySet;
import one.me.calls.impl.service.CallServiceImpl;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.profile.screens.changeowner.ChangeOwnerScreen;

/* renamed from: di1  reason: default package */
public final /* synthetic */ class di1 implements s16 {
    public final /* synthetic */ int a;

    public /* synthetic */ di1(int i) {
        this.a = i;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return new al1();
            case 1:
                dj1 dj1 = CallServiceImpl.w0;
                return (cq1) z11.a.getAccessor().c(cq1.class);
            case 2:
                dj1 dj12 = CallServiceImpl.w0;
                return z11.a.c();
            case 3:
                dj1 dj13 = CallServiceImpl.w0;
                return (n11) z11.a.getAccessor().c(n11.class);
            case 4:
                dj1 dj14 = CallServiceImpl.w0;
                return (nnc) z11.a.getAccessor().c(nnc.class);
            case 5:
                dj1 dj15 = CallServiceImpl.w0;
                return (qna) z11.a.getAccessor().c(qna.class);
            case 6:
                dj1 dj16 = CallServiceImpl.w0;
                return (a61) z11.a.getAccessor().c(a61.class);
            case 7:
                float f = dh4.c().getDisplayMetrics().density * 40.0f;
                return new float[]{f, f, f, f, f, f, f, f};
            case 8:
                return new Object();
            case 9:
                return new Object();
            case 10:
                return new j5c();
            case 11:
                int i = hl1.Z0;
                return -231920335;
            case 12:
                return Boolean.valueOf(((jb5) bh1.a.getAccessor().d(jb5.class).getValue()).r());
            case 13:
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(-15263716);
                return shapeDrawable;
            case 14:
                ShapeDrawable shapeDrawable2 = new ShapeDrawable(new OvalShape());
                shapeDrawable2.getPaint().setColor(-1559425779);
                return shapeDrawable2;
            case 15:
                ShapeDrawable shapeDrawable3 = new ShapeDrawable(new OvalShape());
                shapeDrawable3.getPaint().setColor(-869546428);
                shapeDrawable3.getPaint().setStyle(Paint.Style.STROKE);
                shapeDrawable3.getPaint().setStrokeWidth(dh4.c().getDisplayMetrics().density * 4.0f);
                shapeDrawable3.getPaint().setAntiAlias(true);
                return new InsetDrawable(shapeDrawable3, a24.X(((float) 2) * dh4.c().getDisplayMetrics().density));
            case 16:
                return new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{-1559425779, 0, 0});
            case 17:
                float f2 = dh4.c().getDisplayMetrics().density * 20.0f;
                return new float[]{f2, f2, f2, f2, f2, f2, f2, f2};
            case 18:
                return (qka) z11.a.getAccessor().c(qka.class);
            case 19:
                return new Object();
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                return icd.a(1, 1, 2);
            case 21:
                return new CopyOnWriteArraySet();
            case 22:
                return new CopyOnWriteArraySet();
            case 23:
                return p23.B(":call-active", ":call-answer", ":call-user", ":call-chat", ":call-join-link");
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                return Integer.valueOf(unb.ic_call_16);
            case 25:
                return Integer.valueOf(unb.ic_video_16);
            case 26:
                return new jz1();
            case 27:
                k77[] k77Arr = ChangeOwnerScreen.y0;
                return mnc.g1;
            case 28:
                k77[] k77Arr2 = ChangeOwnerScreen.y0;
                return new lj8(new hd1(4), (h9) null, 6);
            default:
                return new kc3(f2a.R, new hge(h2a.n), 2, false);
        }
    }
}
