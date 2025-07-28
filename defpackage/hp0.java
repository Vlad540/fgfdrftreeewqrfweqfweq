package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.chats.picker.PickerChatController;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.chatscreen.ChatScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.folders.edit.FolderEditScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.messagewrite.MessageWriteWidget;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: hp0  reason: default package */
public final /* synthetic */ class hp0 extends z8 implements i26 {
    public final /* synthetic */ int w0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hp0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.w0 = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        og4 og4 = og4.a;
        aca aca = aca.a;
        yba yba = yba.a;
        ru3 ru3 = ru3.b;
        g5b g5b = null;
        boolean z = true;
        jue jue = jue.a;
        Object obj4 = this.a;
        switch (this.w0) {
            case 0:
                Continuation continuation = (Continuation) obj2;
                ((jp0) obj4).f((g5b) obj);
                return jue;
            case 1:
                Continuation continuation2 = (Continuation) obj2;
                jp0 jp0 = (jp0) obj4;
                jp0.getClass();
                if (hhd.f((og4) obj, og4)) {
                    tf3 tf3 = (tf3) ((ap3) jp0.f.getValue()).c(jp0.a).a.getValue();
                    if (tf3 != null) {
                        g5b E = jp0.E(tf3);
                        g5b g5b2 = (g5b) jp0.e.a.getValue();
                        if (g5b2 != null) {
                            g5b = g5b.a(g5b2, E.a, E.b, 4);
                        }
                        jp0.f(g5b);
                    }
                    return jue;
                }
                throw new NoWhenBranchMatchedException();
            case 2:
                Continuation continuation3 = (Continuation) obj2;
                k77[] k77Arr = CallAdminSettingsScreen.x0;
                ((ux0) obj4).E((List) obj);
                return jue;
            case 3:
                Continuation continuation4 = (Continuation) obj2;
                ((h01) obj4).setVolumeMicrophone(((Number) obj).floatValue());
                return jue;
            case 4:
                scb scb = (scb) obj;
                Continuation continuation5 = (Continuation) obj2;
                rr3 rr3 = (ChatAdminsScreen) obj4;
                k77[] k77Arr2 = ChatAdminsScreen.A0;
                rr3.getClass();
                if (scb instanceof qcb) {
                    hba hba = new hba((Widget) rr3);
                    hba.f(yba);
                    hba.h(((qcb) scb).a);
                    hba.g(aca);
                    hba.d(new zx1(3, rr3));
                    rr3.y0 = hba.j();
                } else if (scb instanceof pcb) {
                    k77[] k77Arr3 = BottomSheetWidget.B0;
                    pcb pcb = (pcb) scb;
                    jc3 a = a24.a(pcb.a, pcb.d, 4);
                    a.f(pcb.b);
                    kc3[] kc3Arr = (kc3[]) pcb.c.toArray(new kc3[0]);
                    a.a((kc3[]) Arrays.copyOf(kc3Arr, kc3Arr.length));
                    rr3 e = a.e();
                    e.setTargetController(rr3);
                    rr3 rr32 = rr3;
                    while (rr32.getParentController() != null) {
                        rr32 = rr32.getParentController();
                    }
                    ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                    if (ygc != null) {
                        g5b = ygc.S();
                    }
                    e.y0(rr3);
                    if (g5b != null) {
                        vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                        rf0.k(false, vgc, true, "BottomSheetWidget");
                        g5b.G(vgc);
                    }
                } else if (scb instanceof rcb) {
                    hba hba2 = new hba((Widget) rr3);
                    hba2.f(new vba(phc.n));
                    hba2.h(((rcb) scb).a);
                    hba2.j();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return jue;
            case 5:
                scb scb2 = (scb) obj;
                Continuation continuation6 = (Continuation) obj2;
                rr3 rr33 = (ChatMembersCompactWidget) obj4;
                k77[] k77Arr4 = ChatMembersCompactWidget.Z;
                rr33.getClass();
                if (scb2 instanceof qcb) {
                    hba hba3 = new hba((Widget) rr33);
                    hba3.f(yba);
                    hba3.h(((qcb) scb2).a);
                    hba3.g(aca);
                    hba3.d(new zx1(10, rr33));
                    rr33.o = hba3.j();
                } else if (scb2 instanceof pcb) {
                    k77[] k77Arr5 = BottomSheetWidget.B0;
                    pcb pcb2 = (pcb) scb2;
                    jc3 a2 = a24.a(pcb2.a, pcb2.d, 4);
                    a2.f(pcb2.b);
                    pcb2.c.forEach(new fh2(new hh2(1, a2, jc3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 0), 0));
                    rr3 e2 = a2.e();
                    e2.setTargetController(rr33);
                    rr3 rr34 = rr33;
                    while (rr34.getParentController() != null) {
                        rr34 = rr34.getParentController();
                    }
                    ygc ygc2 = rr34 instanceof ygc ? (ygc) rr34 : null;
                    if (ygc2 != null) {
                        g5b = ygc2.S();
                    }
                    e2.y0(rr33);
                    if (g5b != null) {
                        vgc vgc2 = new vgc(e2, (String) null, (wr3) null, (wr3) null, false, -1);
                        rf0.k(false, vgc2, true, "BottomSheetWidget");
                        g5b.G(vgc2);
                    }
                } else if (scb2 instanceof rcb) {
                    hba hba4 = new hba((Widget) rr33);
                    hba4.f(new vba(phc.n));
                    hba4.h(((rcb) scb2).a);
                    hba4.j();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return jue;
            case 6:
                scb scb3 = (scb) obj;
                Continuation continuation7 = (Continuation) obj2;
                rr3 rr35 = (ChatMembersScreen) obj4;
                k77[] k77Arr6 = ChatMembersScreen.y0;
                rr35.getClass();
                if (scb3 instanceof qcb) {
                    hba hba5 = new hba((Widget) rr35);
                    hba5.f(yba);
                    hba5.h(((qcb) scb3).a);
                    hba5.g(aca);
                    hba5.d(new zx1(11, rr35));
                    rr35.x0 = hba5.j();
                } else if (scb3 instanceof pcb) {
                    k77[] k77Arr7 = BottomSheetWidget.B0;
                    pcb pcb3 = (pcb) scb3;
                    jc3 a3 = a24.a(pcb3.a, pcb3.d, 4);
                    a3.f(pcb3.b);
                    kc3[] kc3Arr2 = (kc3[]) pcb3.c.toArray(new kc3[0]);
                    a3.a((kc3[]) Arrays.copyOf(kc3Arr2, kc3Arr2.length));
                    rr3 e3 = a3.e();
                    e3.setTargetController(rr35);
                    rr3 rr36 = rr35;
                    while (rr36.getParentController() != null) {
                        rr36 = rr36.getParentController();
                    }
                    ygc ygc3 = rr36 instanceof ygc ? (ygc) rr36 : null;
                    if (ygc3 != null) {
                        g5b = ygc3.S();
                    }
                    e3.y0(rr35);
                    if (g5b != null) {
                        vgc vgc3 = new vgc(e3, (String) null, (wr3) null, (wr3) null, false, -1);
                        rf0.k(false, vgc3, true, "BottomSheetWidget");
                        g5b.G(vgc3);
                    }
                } else if (scb3 instanceof rcb) {
                    hba hba6 = new hba((Widget) rr35);
                    hba6.f(new vba(phc.n));
                    hba6.h(((rcb) scb3).a);
                    hba6.j();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return jue;
            case 7:
                Continuation continuation8 = (Continuation) obj2;
                ((dk2) obj4).f((g5b) obj);
                return jue;
            case 8:
                o68 o68 = (h05) obj;
                Continuation continuation9 = (Continuation) obj2;
                ChatScreen chatScreen = (ChatScreen) obj4;
                k77[] k77Arr8 = ChatScreen.n1;
                chatScreen.getClass();
                if (o68 instanceof s68) {
                    if (((az1) chatScreen.T0.T0(chatScreen, ChatScreen.n1[10])).getVisibility() != 0) {
                        s68 s68 = (s68) o68;
                        if (s68 instanceof o68) {
                            MessageWriteWidget C0 = chatScreen.C0();
                            if (C0 != null) {
                                C0.p0().f(o68.a);
                            }
                        } else if (s68 instanceof p68) {
                            chatScreen.B0().A(4, ((p68) o68).a == l87.Z ? zp8.a : zp8.c);
                        } else if (s68 instanceof n68) {
                            MessageWriteWidget C02 = chatScreen.C0();
                            if (C02 != null) {
                                jq8 p0 = C02.p0();
                                p0.getClass();
                                p0.c.dispatchKeyEvent(new KeyEvent(0, 67));
                            }
                        } else if (s68 instanceof r68) {
                            nn2 L0 = chatScreen.L0();
                            L0.N0.o1(L0, nn2.g1[1], xs7.D(L0.a, L0.u().b(), ru3, new an2(L0, chatScreen.B0().w(), ((r68) o68).a, (Continuation) null)));
                            chatScreen.B0().D((Long) null);
                            tt6 tt6 = (tt6) chatScreen.k1.getValue();
                            if (tt6 != null) {
                                tt6.f(z3d.N(new st6[]{new st6(qt6.Y, 1), new st6(qt6.b, 1)}), mnc.CHAT);
                            }
                        } else if (s68 instanceof q68) {
                            nn2 L02 = chatScreen.L0();
                            L02.O0.o1(L02, nn2.g1[2], xs7.D(L02.a, L02.u().a(), ru3, new bn2(L02, (Continuation) null)));
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                }
                return jue;
            case 9:
                Continuation continuation10 = (Continuation) obj2;
                rr3 rr37 = (ChatScreen) obj4;
                k77[] k77Arr9 = ChatScreen.n1;
                rr37.getClass();
                k77[] k77Arr10 = BottomSheetWidget.B0;
                rr3 addLinkBottomSheet = new AddLinkBottomSheet(rr37.O0, (aa) obj, (x54) null);
                addLinkBottomSheet.setTargetController(rr37);
                while (rr37.getParentController() != null) {
                    rr37 = rr37.getParentController();
                }
                ygc ygc4 = rr37 instanceof ygc ? (ygc) rr37 : null;
                if (ygc4 != null) {
                    g5b = ygc4.S();
                }
                if (g5b != null) {
                    vgc vgc4 = new vgc(addLinkBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc4, true, "BottomSheetWidget");
                    g5b.G(vgc4);
                }
                return jue;
            case 10:
                String str = (String) obj;
                Continuation continuation11 = (Continuation) obj2;
                bt2 bt2 = (bt2) obj4;
                bt2.getClass();
                if (str != null && !h0e.c0(str)) {
                    vs7 vs7 = bt2.o;
                    vs7.getClass();
                    long nanoTime = System.nanoTime();
                    udd.I("vs7", "searchChatsAndMessages start", new Object[0]);
                    vs7.a();
                    vs7.q = str;
                    String str2 = !r1g.p(vs7.r) ? vs7.r : null;
                    phd h = new aid(new mv9(2, new rz3(vs7, 5, str)), new j67(10), (Object) null).h(new j67(11));
                    qmc qmc = vs7.c;
                    dhd mhd = new mhd(h.m(qmc), new os7(vs7, 0), 0);
                    dhd h2 = vs7.e(str).h(new j67(12));
                    vs7.c();
                    dt dtVar = new dt(str, str2);
                    ybe ybe = (ybe) vs7.d;
                    ybe.getClass();
                    an5 a4 = an5.a(new dhd[]{mhd, h2, new aid(new mv9(1, new joc(ybe, 6, dtVar)).i(qmc).h(new os7(vs7, 3)), new j67(8), (Object) null).h(new j67(9)).m(qmc)});
                    fja.D(Integer.MAX_VALUE, "maxConcurrency");
                    go5 go5 = new go5(new cn5(new pn5(a4), new b36(new ss7()), new j67(13), 2), qmc, 1);
                    d97 d97 = new d97(new qs7(vs7, nanoTime, str, 0), new ps7(vs7, str, 1));
                    go5.d(d97);
                    vs7.i = d97;
                }
                return jue;
            case 11:
                Continuation continuation12 = (Continuation) obj2;
                ((yh3) obj4).d((cz1) obj);
                return jue;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                Continuation continuation13 = (Continuation) obj2;
                ((ym3) obj4).f((g5b) obj);
                return jue;
            case 13:
                Continuation continuation14 = (Continuation) obj2;
                ym3 ym3 = (ym3) obj4;
                ym3.getClass();
                if (hhd.f((og4) obj, og4)) {
                    tf3 F = ym3.F();
                    if (F != null) {
                        wia E2 = ym3.E(F);
                        g5b g5b3 = (g5b) ym3.e.a.getValue();
                        if (g5b3 != null) {
                            g5b = g5b.a(g5b3, (l5b) E2.a, (List) E2.b, 4);
                        }
                        ym3.f(g5b);
                    }
                    return jue;
                }
                throw new NoWhenBranchMatchedException();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                Continuation continuation15 = (Continuation) obj2;
                fp3 fp3 = (fp3) obj4;
                fp3.f.o1(fp3, fp3.j[0], xs7.D(fp3.a, ((pae) fp3.d.getValue()).b(), ru3, new ep3(fp3, (String) obj, (Continuation) null)));
                return jue;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                Continuation continuation16 = (Continuation) obj2;
                ((r54) obj4).onThemeChanged((pda) obj);
                return jue;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                Continuation continuation17 = (Continuation) obj2;
                k77[] k77Arr11 = FolderEditScreen.w0;
                ((op5) obj4).E((List) obj);
                return jue;
            case LangUtils.HASH_SEED /*17*/:
                Continuation continuation18 = (Continuation) obj2;
                MediaBarWidget mediaBarWidget = (MediaBarWidget) obj4;
                k77[] k77Arr12 = MediaBarWidget.h1;
                mediaBarWidget.getClass();
                int t = hr1.t(((kt8) obj).a);
                if (t == 0) {
                    z68 z68 = mediaBarWidget.f1;
                    if (z68 != null) {
                        k77[] k77Arr13 = z68.m;
                        z68.e(true);
                    }
                    mediaBarWidget.v0().setLeftIcon(phc.Z0);
                    ek8.g(mediaBarWidget.q0(), MediaBarWidget.i1, (u16) null);
                } else if (t == 1) {
                    if (!mediaBarWidget.u0().n()) {
                        sgc u0 = mediaBarWidget.u0();
                        Class<inc> cls = inc.class;
                        Object E3 = ek8.E(mediaBarWidget.getArgs(), "scope_id", cls);
                        if (E3 != null) {
                            k77 k77 = MediaBarWidget.h1[0];
                            u0.R(n06.f(new MediaKeyboardWidget(((inc) ((Parcelable) E3)).a, ((Number) mediaBarWidget.b.a(mediaBarWidget)).longValue(), true, (x54) null), (wr3) null, (wr3) null));
                        } else {
                            throw new IllegalArgumentException(wn6.i("No value passed for key scope_id of type ", cls.getSimpleName(), " in bundle").toString());
                        }
                    }
                    LinearLayout q0 = mediaBarWidget.q0();
                    WeakHashMap weakHashMap = eaf.a;
                    t9f.u(q0, (uw9) null);
                    mediaBarWidget.w0().k();
                    z68 z682 = mediaBarWidget.f1;
                    if (z682 != null) {
                        z682.f();
                    }
                    mediaBarWidget.v0().setLeftIcon(phc.d1);
                } else if (t == 2) {
                    bw5 bw5 = mediaBarWidget.e1;
                    bw5.getClass();
                    bw5.b.v0().e(true);
                    mediaBarWidget.v0().setLeftIcon(phc.Z0);
                    ez3.N(new ck5(ez3.e0(new ik5(e87.f, 23), 1), new q08((Continuation) null, mediaBarWidget), 5), mediaBarWidget.getViewLifecycleScope());
                }
                return jue;
            case 18:
                o68 o682 = (h05) obj;
                Continuation continuation19 = (Continuation) obj2;
                t68 t68 = (t68) obj4;
                t68.getClass();
                if (o682 instanceof s68) {
                    s68 s682 = (s68) o682;
                    boolean z2 = s682 instanceof o68;
                    jq8 jq8 = t68.b;
                    if (z2) {
                        jq8.f(o682.a);
                    } else if (s682 instanceof n68) {
                        jq8.getClass();
                        jq8.c.dispatchKeyEvent(new KeyEvent(0, 67));
                    }
                }
                return jue;
            case 19:
                Continuation continuation20 = (Continuation) obj2;
                k77[] k77Arr14 = MembersListWidget.H0;
                ((ck8) ((uj8) obj4).w0.getValue()).a((String) obj);
                return jue;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                a34 a34 = (sg9) obj;
                Continuation continuation21 = (Continuation) obj2;
                MessagesListWidget messagesListWidget = (MessagesListWidget) obj4;
                k77[] k77Arr15 = MessagesListWidget.b1;
                messagesListWidget.getClass();
                if (a34 instanceof a34) {
                    bx8.c.R1(a34);
                } else {
                    boolean z3 = a34 instanceof rfa;
                    t97 t97 = messagesListWidget.z0;
                    if (z3) {
                        rfa rfa = (rfa) a34;
                        ((we1) t97.getValue()).l(rfa.b, rfa.c, new ko8((sg9) a34, 1));
                    } else if (a34 instanceof ffa) {
                        ffa ffa = (ffa) a34;
                        we1.k((we1) t97.getValue(), ffa.d, ffa.c, new ko8((sg9) a34, 2));
                    } else if (a34 instanceof sfa) {
                        Intent intent = new Intent("android.intent.action.INSERT");
                        intent.setType("vnd.android.cursor.dir/raw_contact");
                        sfa sfa = (sfa) a34;
                        intent.putExtra("name", sfa.c);
                        intent.putExtra("phone", sfa.d);
                        try {
                            messagesListWidget.getContext().startActivity(intent);
                        } catch (ActivityNotFoundException unused) {
                            udd.s(MessagesListWidget.class.getName(), wn6.k(new StringBuilder("error creating a new contact #"), sfa.b, " in phonebook"), (Throwable) null);
                        }
                    } else if (a34 instanceof ifa) {
                        ek8.G(messagesListWidget.getContext(), ((ifa) a34).b);
                    } else if (a34 instanceof jfa) {
                        jfa jfa = (jfa) a34;
                        Intent intent2 = jfa.b;
                        try {
                            messagesListWidget.getContext().startActivity(intent2);
                        } catch (Exception unused2) {
                            intent2.setDataAndType(jfa.c, "*/*");
                            messagesListWidget.getContext().startActivity(intent2);
                        }
                    } else if (a34 instanceof ofa) {
                        bx8 bx8 = bx8.c;
                        ofa ofa = (ofa) a34;
                        Parcelable parcelable = ofa.b;
                        bx8.getClass();
                        bx8.P1().b(":attach/fullscreen?attachment_id=".concat(ofa.c), jjd.j(new wia[]{new wia("message", parcelable)}));
                    } else if (a34 instanceof uz6) {
                        ((d34) xv8.a.getAccessor().c(d34.class)).c(((k34) ((uz6) a34).a).a, (Bundle) null);
                    } else if (a34 instanceof c65) {
                        bx8.c.P1().b(":external_callback", jjd.j(new wia[]{new wia("params", ((c65) a34).b)}));
                    } else {
                        udd.s(messagesListWidget.a, "Unknown navigation event " + a34, (Throwable) null);
                    }
                }
                return jue;
            case 21:
                Continuation continuation22 = (Continuation) obj2;
                k77[] k77Arr16 = MessagesSettingsScreen.Y;
                ((g7d) obj4).E((List) obj);
                return jue;
            case 22:
                q99 q99 = (q99) obj;
                Continuation continuation23 = (Continuation) obj2;
                ca9 ca9 = (ca9) obj4;
                ca9.getClass();
                boolean z4 = q99.a;
                cxc cxc = ca9.d;
                RecyclerView recyclerView = ca9.a;
                if (!z4) {
                    hk3 hk3 = ca9.e;
                    if (hk3 != null) {
                        recyclerView.p0(hk3);
                    }
                    ca9.e = null;
                    u24 u24 = ca9.f;
                    if (u24 != null) {
                        recyclerView.r0(u24);
                    }
                    ca9.f = null;
                    if (cxc.b()) {
                        cxc.a();
                    }
                } else {
                    if (ca9.e == null) {
                        hk3 hk32 = new hk3(new z99(ca9, 1), new aa9(ca9, 1));
                        recyclerView.j(hk32);
                        ca9.e = hk32;
                        u24 u242 = new u24(recyclerView);
                        recyclerView.l(u242);
                        ca9.f = u242;
                    }
                    Set set = q99.b;
                    cxc.c(set.isEmpty() ? recyclerView.getContext().getString(sca.H) : recyclerView.getContext().getString(sca.I, new Object[]{Integer.valueOf(set.size())}), q99.c, new z99(ca9, 0), new aa9(ca9, 0));
                    recyclerView.Y();
                }
                return jue;
            case 23:
                r99 r99 = (r99) obj;
                Continuation continuation24 = (Continuation) obj2;
                da9 da9 = (da9) obj4;
                da9.getClass();
                boolean isEmpty = r99.a.isEmpty();
                nx8 nx8 = da9.d;
                RecyclerView recyclerView2 = da9.a;
                if (isEmpty) {
                    tw2 tw2 = da9.e;
                    if (tw2 != null) {
                        recyclerView2.p0(tw2);
                    }
                    da9.e = null;
                    u24 u243 = da9.f;
                    if (u243 != null) {
                        recyclerView2.r0(u243);
                    }
                    da9.f = null;
                    nx8.Y.m((Object) null, new y99(0, hw4.a));
                } else {
                    if (da9.e == null) {
                        tw2 tw22 = new tw2(new qk8(8, da9), new ba9(da9, 0), new ba9(da9, 1), new ba9(da9, 2));
                        recyclerView2.j(tw22);
                        da9.e = tw22;
                        u24 u244 = new u24(recyclerView2);
                        recyclerView2.l(u244);
                        da9.f = u244;
                    }
                    nx8.Y.m((Object) null, new y99(r99.a.size(), r99.b));
                    recyclerView2.Y();
                }
                return jue;
            case 24:
                kt8 kt8 = (kt8) obj;
                Continuation continuation25 = (Continuation) obj2;
                PickerChatController pickerChatController = (PickerChatController) obj4;
                sgc sgc = pickerChatController.C0;
                if (sgc != null) {
                    int t2 = hr1.t(kt8.a);
                    nl0 nl0 = pickerChatController.y0;
                    if (t2 == 0) {
                        z68 z683 = pickerChatController.E0;
                        if (z683 != null) {
                            k77[] k77Arr17 = z68.m;
                            z683.e(true);
                        }
                        ((jq8) nl0.getValue()).setLeftIcon(phc.Z0);
                        ek8.g(pickerChatController.n0(), PickerChatController.G0, (u16) null);
                    } else if (t2 == 1) {
                        if (!sgc.n()) {
                            sgc.R(n06.f(new MediaKeyboardWidget(pickerChatController.a, 0, true, 2, (x54) null), (wr3) null, (wr3) null));
                        }
                        View n0 = pickerChatController.n0();
                        WeakHashMap weakHashMap2 = eaf.a;
                        t9f.u(n0, (uw9) null);
                        z68 z684 = pickerChatController.E0;
                        if (z684 != null) {
                            z684.f();
                        }
                        ((jq8) nl0.getValue()).setLeftIcon(phc.d1);
                    } else if (t2 == 2) {
                        nl0 nl02 = pickerChatController.D0.b.y0;
                        if (nl02.a()) {
                            ((jq8) nl02.getValue()).e(true);
                        }
                        ((jq8) nl0.getValue()).setLeftIcon(phc.Z0);
                        ez3.N(new ck5(ez3.e0(new u09(e87.f, 14), 1), new bra(pickerChatController, (Continuation) null), 5), pickerChatController.getViewLifecycleScope());
                    }
                }
                return jue;
            case 25:
                String str3 = (String) obj;
                Continuation continuation26 = (Continuation) obj2;
                ksa ksa = (ksa) obj4;
                k77[] k77Arr18 = PickerChatsListWidget2.G0;
                if (str3 != null) {
                    ksa.getClass();
                    if (!h0e.c0(str3)) {
                        ksa.B0.o1(ksa, ksa.K0[0], taf.n(ksa, (hu3) null, ru3, new dsa(ksa, str3, (Continuation) null), 1));
                        return jue;
                    }
                }
                ksa.F0.setValue((Object) null);
                return jue;
            case 26:
                String str4 = (String) obj;
                Continuation continuation27 = (Continuation) obj2;
                wta wta = (wta) obj4;
                k77[] k77Arr19 = PickerContactsListWidget.C0;
                if (str4 != null) {
                    wta.getClass();
                    if (str4.length() != 0) {
                        wta.X.o1(wta, wta.Y[0], taf.n(wta, (hu3) null, ru3, new uta(wta, str4, (Continuation) null), 1));
                        return jue;
                    }
                }
                wta.getClass();
                wta.X.o1(wta, wta.Y[0], (Object) null);
                wta.c.b();
                return jue;
            case 27:
                String str5 = (String) obj;
                Continuation continuation28 = (Continuation) obj2;
                kua kua = (kua) obj4;
                k77[] k77Arr20 = PickerMembersListWidget.B0;
                if (str5 != null) {
                    kua.getClass();
                    if (str5.length() != 0) {
                        kua.Z.o1(kua, kua.w0[0], taf.n(kua, (hu3) null, ru3, new iua(kua, str5, (Continuation) null), 1));
                        return jue;
                    }
                }
                kua.getClass();
                kua.Z.o1(kua, kua.w0[0], (Object) null);
                kua.Y.setValue((Object) null);
                return jue;
            case 28:
                i22 i22 = (i22) obj;
                Continuation continuation29 = (Continuation) obj2;
                tva tva = (tva) obj4;
                tva.getClass();
                yia yia = (yia) i22.A0.updateAndGet(new g22(i22, 0));
                CharSequence charSequence = yia != null ? (CharSequence) yia.b : null;
                if (i22.G()) {
                    z = i22.u();
                }
                if (charSequence == null || charSequence.length() == 0) {
                    obj3 = wva.a;
                } else {
                    xm8 xm8 = i22.X;
                    if (xm8 != null) {
                        obj3 = new xva(xm8.a.b, new lge(charSequence), z);
                    } else {
                        throw new IllegalArgumentException("Required value was null.".toString());
                    }
                }
                tva.h.m((Object) null, obj3);
                return jue;
            default:
                Continuation continuation30 = (Continuation) obj2;
                k77[] k77Arr21 = ProfileInviteScreen.Y;
                ((hbb) obj4).E((List) obj);
                return jue;
        }
    }
}
