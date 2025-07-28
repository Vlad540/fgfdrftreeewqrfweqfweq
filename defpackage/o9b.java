package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* renamed from: o9b  reason: default package */
public final class o9b extends l5e implements i26 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ProfileEditScreen Y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o9b(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.Y = profileEditScreen;
    }

    public final Object invoke(Object obj, Object obj2) {
        return n((sg9) obj, (Continuation) obj2).o(jue.a);
    }

    public final Continuation n(Object obj, Continuation continuation) {
        o9b o9b = new o9b(this.Y, continuation);
        o9b.X = obj;
        return o9b;
    }

    public final Object o(Object obj) {
        wx3.H(obj);
        a34 a34 = (sg9) this.X;
        boolean f = hhd.f(a34, v8b.b);
        jue jue = jue.a;
        if (!f) {
            boolean z = a34 instanceof d9b;
            sgc sgc = null;
            rr3 rr3 = this.Y;
            if (z) {
                bm3.p(rr3);
                k77[] k77Arr = BottomSheetWidget.B0;
                d9b d9b = (d9b) a34;
                jc3 a = a24.a(d9b.b, (Bundle) null, 6);
                a.f(d9b.c);
                d9b.d.forEach(new fh2(new hh2(1, a, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 10), 8));
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
            } else if (a34 instanceof e9b) {
                e9b e9b = (e9b) a34;
                CharSequence a2 = e9b.b.a(rr3.getContext());
                if (a2 == null) {
                    return jue;
                }
                hba hba = new hba((Widget) rr3);
                hba.i(a2);
                Integer num = e9b.c;
                hba.f(num != null ? new vba(num.intValue()) : wba.a);
                hba.j();
            } else if (hhd.f(a34, a9b.b)) {
                k77[] k77Arr2 = ProfileEditScreen.C0;
                rr3.m0().u();
            } else if (hhd.f(a34, c9b.b)) {
                s8b.c.P1().b(":media-picker/select/photo", (Bundle) null);
            } else if (a34 instanceof b9b) {
                try {
                    rr3.startActivityForResult(((b9b) a34).b, 333);
                    xg9.g((xg9) rr3.A0.getValue(), mnc.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    udd.s(rr3.getClass().getName(), "failed open camera", (Throwable) null);
                    rr3.m0().s();
                }
            } else if (a34 instanceof w8b) {
                rr3.startActivityForResult(((w8b) a34).b, 666);
            } else if (hhd.f(a34, t8b.b)) {
                k77[] k77Arr3 = ProfileEditScreen.C0;
                ((qna) rr3.z0.getValue()).g(new jrf(rr3, 1));
            } else if (hhd.f(a34, z8b.b)) {
                k77[] k77Arr4 = ProfileEditScreen.C0;
                if (rr3.getRouter().e().size() == 2) {
                    vgc vgc2 = (vgc) rr3.getRouter().e().get(1);
                    if (hhd.f(vgc2 != null ? vgc2.a : null, rr3)) {
                        Activity d = s8b.c.P1().a().f().C().d();
                        if (d != null) {
                            d.finish();
                        }
                    }
                }
                s8b.c.P1().b(":chat-list", (Bundle) null);
            } else if (a34 instanceof y8b) {
                s8b.c.P1().b(us8.j(((y8b) a34).b, ":chats?id=", "&type=local"), (Bundle) null);
            } else if (a34 instanceof a34) {
                s8b.c.R1(a34);
            } else if (a34 instanceof u8b) {
                u8b u8b = (u8b) a34;
                int ordinal = u8b.c.ordinal();
                long j = u8b.b;
                if (ordinal == 0) {
                    s8b.c.P1().b(us8.j(j, ":profile/edit/link?id=", "&type=local_chat&flow=edit"), (Bundle) null);
                } else if (ordinal == 1) {
                    s8b.c.P1().b(us8.j(j, ":profile/edit/link?id=", "&type=server_chat&flow=edit"), (Bundle) null);
                } else if (ordinal == 2) {
                    s8b s8b = s8b.c;
                    s8b.getClass();
                    vqc vqc = (vqc) ((xzc) z7b.a.getAccessor().d(xzc.class).getValue());
                    vqc.getClass();
                    if (vqc.m(PmsKey.f1accountnicknameenabled, false)) {
                        s8b.P1().b(us8.j(j, ":profile/edit/link?id=", "&type=contact&flow=edit"), (Bundle) null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else if (a34 instanceof x8b) {
                s8b s8b2 = s8b.c;
                long j2 = ((x8b) a34).b;
                d34 P1 = s8b2.P1();
                P1.b(":profile/invite?id=" + j2, (Bundle) null);
            } else if (a34 instanceof v03) {
                bm3.p(rr3);
                rr3.getRouter().B(rr3);
            }
        }
        return jue;
    }
}
