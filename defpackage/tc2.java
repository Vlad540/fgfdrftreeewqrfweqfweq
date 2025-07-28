package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.Collections;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.media.ChatMediaListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* renamed from: tc2  reason: default package */
public final class tc2 extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatMediaListWidget Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public tc2(Continuation continuation, ChatMediaListWidget chatMediaListWidget) {
        super(2, continuation);
        this.Y = chatMediaListWidget;
    }

    public final Object invoke(Object obj, Object obj2) {
        jue jue = jue.a;
        n(obj, (Continuation) obj2).o(jue);
        return jue;
    }

    public final Continuation n(Object obj, Continuation continuation) {
        tc2 tc2 = new tc2(continuation, this.Y);
        tc2.X = obj;
        return tc2;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        qd2 qd2 = (qd2) this.X;
        sgc sgc = null;
        if (qd2 instanceof jd2) {
            kdb kdb = kdb.c;
            jd2 jd2 = (jd2) qd2;
            long j = jd2.b;
            d34 P1 = kdb.P1();
            StringBuilder k = hr1.k(j, ":attach/viewer?chat_id=", "&attach_id=");
            k.append(jd2.d);
            k.append("&msg_id=");
            k.append(jd2.c);
            k.append("&single=");
            k.append(jd2.e);
            k.append("&desc=true");
            P1.b(k.toString(), (Bundle) null);
        } else if (qd2 instanceof kd2) {
            kdb kdb2 = kdb.c;
            kd2 kd2 = (kd2) qd2;
            Parcelable parcelable = kd2.b;
            kdb2.getClass();
            Bundle j2 = jjd.j(new wia[]{new wia("message", parcelable)});
            d34 P12 = kdb2.P1();
            P12.b(":attach/fullscreen?attachment_id=" + kd2.c + "&single_attach=" + kd2.d + "&desc_order=true", j2);
        } else {
            boolean z = qd2 instanceof ld2;
            rr3 rr3 = this.Y;
            if (z) {
                swb.G(rr3.getContext(), ((ld2) qd2).b);
            } else if (qd2 instanceof md2) {
                kdb kdb3 = kdb.c;
                md2 md2 = (md2) qd2;
                long j3 = md2.b;
                d34 P13 = kdb3.P1();
                StringBuilder k2 = hr1.k(j3, ":chats?id=", "&type=local&message_id=");
                k2.append(md2.c);
                P13.b(k2.toString(), (Bundle) null);
            } else if (qd2 instanceof od2) {
                swb.O(rr3.getContext(), ((od2) qd2).b);
            } else if (qd2 instanceof hd2) {
                hhd.q(rr3.getContext(), ((hd2) qd2).b);
            } else if (qd2 instanceof nd2) {
                kdb kdb4 = kdb.c;
                nd2 nd2 = (nd2) qd2;
                Long l = nd2.b;
                List singletonList = Collections.singletonList(new Long(nd2.c));
                if (l != null) {
                    d34 P14 = kdb4.P1();
                    String c0 = o23.c0(singletonList, ",", (String) null, (String) null, (u16) null, 62);
                    P14.b(":chats/forward?messages_ids=" + c0 + "&attach_id=" + l + "&is_forward_attach=" + nd2.d, (Bundle) null);
                } else {
                    kdb4.P1().b(":chats/forward?messages_ids=".concat(o23.c0(singletonList, ",", (String) null, (String) null, (u16) null, 62)), (Bundle) null);
                }
            } else if (qd2 instanceof id2) {
                try {
                    rr3.getContext().startActivity(((id2) qd2).b);
                } catch (Exception unused) {
                    id2 id2 = (id2) qd2;
                    id2.b.setDataAndType(id2.c, "*/*");
                    rr3.getContext().startActivity(id2.b);
                }
            } else if (qd2 instanceof pd2) {
                k77[] k77Arr = BottomSheetWidget.B0;
                pd2 pd2 = (pd2) qd2;
                mge mge = pd2.c;
                rh8 rh8 = pd2.b;
                jc3 a = a24.a(mge, jjd.j(new wia[]{new wia("selected_message_id", new Long(rh8.j())), new wia("selected_attach_id", new Long(rh8.h()))}), 4);
                a.f(pd2.d);
                for (kc3 kc3 : pd2.e) {
                    a.a(kc3);
                }
                ConfirmationBottomSheet e = a.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                e.y0(rr3);
                if (sgc != null) {
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                }
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return jue.a;
    }
}
