package defpackage;

import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.ViewGroup;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* renamed from: vu8  reason: default package */
public final class vu8 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ MessageWriteWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public vu8(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.Y = messageWriteWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        vu8 vu8 = new vu8(continuation, this.Y);
        vu8.X = obj;
        return vu8;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        ut8 ut8 = (ut8) this.X;
        k77[] k77Arr = MessageWriteWidget.J0;
        MessageWriteWidget messageWriteWidget = this.Y;
        messageWriteWidget.getClass();
        z2c z2c = ut8.a;
        MotionEvent motionEvent = ut8.b;
        if (motionEvent.getAction() == 0) {
            int ordinal = ut8.a.ordinal();
            if (ordinal == 0) {
                qna q0 = messageWriteWidget.q0();
                String[] strArr = qna.p;
                if (!q0.b(strArr)) {
                    qna q02 = messageWriteWidget.q0();
                    jrf jrf = new jrf(messageWriteWidget, 1);
                    int w0 = messageWriteWidget.w0();
                    int i = iub.permissions_video_message_request;
                    q02.getClass();
                    int i2 = baa.g;
                    if (qna.i(jrf, strArr)) {
                        jrf.c(strArr, 181, w0, i, i2);
                    } else {
                        q02.f(jrf, strArr, 181);
                    }
                    return jue.a;
                }
            } else if (ordinal == 1) {
                qna q03 = messageWriteWidget.q0();
                String[] strArr2 = qna.h;
                if (!q03.b(strArr2)) {
                    qna q04 = messageWriteWidget.q0();
                    jrf jrf2 = new jrf(messageWriteWidget, 1);
                    int i3 = baa.c;
                    q04.getClass();
                    int i4 = iub.permissions_audio_title;
                    int i5 = baa.g;
                    if (qna.i(jrf2, strArr2)) {
                        jrf2.c(strArr2, 160, i4, i3, i5);
                    } else {
                        q04.f(jrf2, strArr2, 160);
                    }
                    return jue.a;
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        String b = messageWriteWidget.s0().b();
        String h = rf0.h("record_controls_controller_", z2c.name());
        if (messageWriteWidget.s0().a() == null || !hhd.f(b, h)) {
            Class<inc> cls = inc.class;
            Object E = ek8.E(messageWriteWidget.getArgs(), "arg_scope_id", cls);
            if (E != null) {
                ax2 s0 = messageWriteWidget.s0();
                boolean f = hhd.f(s0.b(), h);
                String str = ((inc) ((Parcelable) E)).a;
                if (!f) {
                    vgc vgc = new vgc(new RecordControlsWidget(str, z2c, (x54) null), (String) null, (wr3) null, (wr3) null, false, -1);
                    vgc.d(h);
                    s0.a.R(vgc);
                }
                sgc childRouter = messageWriteWidget.getChildRouter((ViewGroup) messageWriteWidget.C0.T0(messageWriteWidget, MessageWriteWidget.J0[4]));
                childRouter.e = 1;
                childRouter.Q(false);
                if (!childRouter.n()) {
                    childRouter.R(n06.f(new RecordControlsWidget(str, z2c, (x54) null), (wr3) null, (wr3) null));
                }
            } else {
                throw new IllegalArgumentException(wn6.i("No value passed for key arg_scope_id of type ", cls.getSimpleName(), " in bundle").toString());
            }
        }
        RecordControlsWidget a = messageWriteWidget.s0().a();
        RecordControlsWidget recordControlsWidget = a instanceof RecordControlsWidget ? a : null;
        if (recordControlsWidget != null) {
            y3c L0 = recordControlsWidget.L0();
            if (L0.A0.getValue() == null) {
                int action = motionEvent.getAction();
                e3 e3Var = L0.L0;
                if (action == 0) {
                    if (!L0.v().i()) {
                        taf.o(L0.G0, j3c.a);
                    } else {
                        e3Var.o1(L0, y3c.N0[0], xs7.E(L0.a, (hu3) null, ru3.b, new s3c(L0, (Continuation) null), 1));
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    k77[] k77Arr2 = y3c.N0;
                    g37 g37 = (g37) e3Var.T0(L0, k77Arr2[0]);
                    if (g37 != null && g37.isActive() && L0.v().i()) {
                        hge hge = new hge(z9a.g);
                        h3c h3c = L0.c;
                        h3c.getClass();
                        taf.o(h3c.b, new f3c(L0.b, hge));
                    }
                    g37 g372 = (g37) e3Var.T0(L0, k77Arr2[0]);
                    if (g372 != null) {
                        g372.cancel((CancellationException) null);
                    }
                    g37 g373 = (g37) L0.M0.T0(L0, k77Arr2[1]);
                    if (g373 != null) {
                        g373.cancel((CancellationException) null);
                    }
                }
            } else if (motionEvent.getAction() == 3) {
                L0.t();
            } else if (motionEvent.getAction() == 1 && !L0.w()) {
                L0.A(true);
            } else if ((L0.B0.a.getValue() instanceof n3c) && !L0.w()) {
                taf.o(L0.H0, motionEvent);
            }
        }
        return jue.a;
    }
}
