package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.View;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.chats.list.ChatsListWidget;
import one.me.contactlist.ContactListWidget;
import one.me.notifications.settings.screens.chat.ChatNotificationsSettingsScreen;
import one.me.profile.screens.members.ChatAdminsScreen;
import one.me.profile.screens.members.ChatMembersScreen;
import one.me.profile.screens.members.compact.ChatMembersCompactWidget;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import ru.ok.android.externcalls.sdk.ConversationFactory;
import ru.ok.android.externcalls.sdk.ConversationParticipant;
import ru.ok.android.externcalls.sdk.events.MultiEventListener;
import ru.ok.android.externcalls.sdk.factory.JoinAnonByLinkParams;
import ru.ok.android.externcalls.sdk.id.ExternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.ParticipantsUpdater;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.tamtam.util.HandledException;

/* renamed from: zx1  reason: default package */
public final /* synthetic */ class zx1 implements kf7, iba, of3, r3e, otc, vr5, i83, gk3, bid, h2e, rl, ParticipantsUpdater.MeChanger, ExternalIdsResolver.ExtraResolver, mh7 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zx1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void J(jba jba) {
        cj8 cj8 = cj8.a;
        jba jba2 = jba.X;
        Object obj = this.b;
        switch (this.a) {
            case 3:
                k77[] k77Arr = ChatAdminsScreen.A0;
                ChatAdminsScreen chatAdminsScreen = (ChatAdminsScreen) obj;
                if (jba == jba2) {
                    taf.o(chatAdminsScreen.n0().Y, cj8);
                    y22 l0 = chatAdminsScreen.l0();
                    ArrayList arrayList = l0.z0;
                    int size = arrayList.size();
                    arrayList.clear();
                    taf.o(l0.A0, new rcb(new jge(l8a.r2, cs.g0(new Object[]{Integer.valueOf(size)}))));
                    return;
                }
                chatAdminsScreen.l0().r();
                return;
            case 10:
                k77[] k77Arr2 = ChatMembersCompactWidget.Z;
                ChatMembersCompactWidget chatMembersCompactWidget = (ChatMembersCompactWidget) obj;
                if (jba == jba2) {
                    taf.o(chatMembersCompactWidget.n0().Y, cj8);
                    chatMembersCompactWidget.m0().v();
                    return;
                }
                chatMembersCompactWidget.m0().w();
                return;
            case 11:
                k77[] k77Arr3 = ChatMembersScreen.y0;
                ChatMembersScreen chatMembersScreen = (ChatMembersScreen) obj;
                if (jba == jba2) {
                    taf.o(chatMembersScreen.n0().Y, cj8);
                    chatMembersScreen.m0().v();
                    return;
                }
                chatMembersScreen.m0().w();
                return;
            default:
                if (si3.$EnumSwitchMapping$0[jba.ordinal()] == 1) {
                    hj3 hj3 = (hj3) obj;
                    xs7.E(hj3.a, hj3.q().b().plus(sk9.a), (ru3) null, new ri3(hj3, (Continuation) null), 2);
                    return;
                }
                return;
        }
    }

    public List a() {
        return (List) ((jp3) this.b).d.getValue();
    }

    public void accept(Object obj) {
        hi3 hi3;
        int i = 0;
        ii3 ii3 = null;
        Object obj2 = this.b;
        switch (this.a) {
            case 4:
                y52 y52 = (y52) obj;
                qf3[] qf3Arr = (qf3[]) obj2;
                int length = qf3Arr.length;
                while (i < length) {
                    qf3 qf3 = qf3Arr[i];
                    if (qf3 != null) {
                        qf3.accept(y52);
                    }
                    i++;
                }
                return;
            case 5:
                y52 y522 = (y52) obj;
                m62 m62 = (m62) obj2;
                y522.c = m62;
                if (m62 == m62.o || m62 == m62.b) {
                    y522.x = 0;
                    return;
                }
                return;
            case 7:
                y52 y523 = (y52) obj;
                f62 f62 = y523.p;
                if (f62 == null) {
                    f62 = f62.h;
                }
                y523.p = fu7.i((tn2) obj2, f62);
                return;
            case 8:
                xm8 xm8 = (xm8) obj;
                bd2 bd2 = (bd2) obj2;
                bd2.getClass();
                udd.p("bd2", "onMessageUpdated: messageId = " + xm8.a.b, new Object[0]);
                while (true) {
                    ArrayList arrayList = bd2.d;
                    if (i >= arrayList.size()) {
                        return;
                    }
                    if (((xm8) arrayList.get(i)).a.b == xm8.a.b) {
                        arrayList.set(i, xm8);
                        for (ActAttachesView actAttachesView : bd2.o) {
                            if (actAttachesView != null) {
                                actAttachesView.m0(xm8);
                            }
                        }
                        return;
                    }
                    i++;
                }
            case 13:
                i22 i22 = (i22) obj;
                gp2 gp2 = (gp2) obj2;
                taf.n(gp2, ((pae) gp2.Z.getValue()).b(), (ru3) null, new fp2(gp2, i22, (Continuation) null), 2);
                taf.o(gp2.E0, new no2(i22.a));
                ((tt0) gp2.z0.getValue()).c(new Object());
                tt6 tt6 = (tt6) gp2.y0.getValue();
                if (tt6 != null) {
                    tt6.f(Collections.singleton(new st6(qt6.CREATE_2_GROUP_CHATS, 1)), mnc.Q0);
                    return;
                }
                return;
            case 16:
                ((gi3) obj).i = (li3) obj2;
                return;
            case 17:
                gi3 gi3 = (gi3) obj;
                nu7 nu7 = am7.c;
                ioa ioa = (ioa) obj2;
                boolean p = r1g.p(ioa.y0);
                String str = BuildConfig.FLAVOR;
                if (!p) {
                    gi3.d = ioa.y0;
                } else {
                    gi3.d = str;
                }
                List list = gi3.f;
                Iterator it = list.iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hi3 = hi3.b;
                    if (hasNext) {
                        ii3 ii32 = (ii3) it.next();
                        if (ii32.c == hi3) {
                            ii3 = ii32;
                        }
                    }
                }
                if (ii3 != null) {
                    list.remove(ii3);
                }
                String str2 = ioa.w0;
                if (!r1g.p(str2)) {
                    String str3 = ioa.x0;
                    if (str3 != null) {
                        str = str3;
                    }
                    list.add(new ii3(str2, hi3, str));
                }
                gi3.f = list;
                return;
            case 22:
                Integer num = (Integer) obj;
                ((oo3) obj2).b();
                return;
            default:
                Throwable th = (Throwable) obj;
                udd.r("oo3", th.getMessage());
                ((g15) obj2).c(new HandledException(th), true);
                return;
        }
    }

    public void b(View view, String str) {
        int i = ChangeDisabledDialog.C0;
        ChangeDisabledDialog changeDisabledDialog = (ChangeDisabledDialog) this.b;
        e07.F(changeDisabledDialog, str, new bk(5, changeDisabledDialog));
    }

    public boolean c(int i) {
        CharSequence m0;
        ContactListWidget contactListWidget = (ContactListWidget) this.b;
        t93 t93 = contactListWidget.y0;
        int j = t93.j();
        cpf cpf = contactListWidget.Z;
        if (!(i == j - cpf.j() && ((m0 = contactListWidget.m0()) == null || m0.length() == 0))) {
            return i == t93.j() - (cpf.j() + contactListWidget.X.j());
        }
    }

    public void d(rr5 rr5) {
        k77[] k77Arr = ChatsListWidget.O0;
        fu2 o0 = ((ChatsListWidget) this.b).o0();
        o0.getClass();
        String name = fu2.class.getName();
        fn6 fn6 = udd.e;
        if (fn6 != null && fn6.c()) {
            tn7 tn7 = tn7.Y;
            fn6.d(tn7, name, "onFolderWidgetClicked " + rr5, (Throwable) null);
        }
        qr5 qr5 = rr5.Y;
        if (qr5 instanceof pr5) {
            String str = ((pr5) qr5).a;
            ef7 ef7 = (ef7) o0.G0.getValue();
            ef7.getClass();
            ez3.N(ez3.J(new ck5(ef7.e(Uri.parse(str)), new ft2(o0, (Continuation) null), 5), o0.Y.b()), o0.a);
        } else if (qr5 instanceof or5) {
            or5 or5 = (or5) qr5;
            taf.o(o0.Q0, zu2.c2(zu2.c, or5.a, bff.X, or5.b, 0, 8));
        } else if (qr5 != null) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public void e(Object obj, vi5 vi5) {
        n35 n35 = (n35) obj;
        SparseArray sparseArray = ((f44) this.b).X;
        SparseBooleanArray sparseBooleanArray = vi5.a;
        SparseArray sparseArray2 = new SparseArray(sparseBooleanArray.size());
        for (int i = 0; i < sparseBooleanArray.size(); i++) {
            int a2 = vi5.a(i);
            fd fdVar = (fd) sparseArray.get(a2);
            fdVar.getClass();
            sparseArray2.append(a2, fdVar);
        }
        n35.getClass();
    }

    public Object get() {
        ((Runnable) this.b).run();
        return null;
    }

    public Object h(uwb uwb) {
        return this.b;
    }

    public int i(int i) {
        g7d g7d = ((ChatNotificationsSettingsScreen) this.b).c;
        e7d e7d = (pg7) g7d.C(i);
        if (e7d.u() == 0) {
            return 4;
        }
        if (i != g7d.j() - 1) {
            e7d e7d2 = (pg7) g7d.C(i + 1);
            if (e7d.u() != ((pg7) g7d.C(i - 1)).u()) {
                return 1;
            }
            if (e7d.u() == e7d2.u()) {
                return 2;
            }
        }
        return 3;
    }

    public void j(ihd ihd) {
        ihd.a(Collator.getInstance(((g2b) this.b).a.u()));
    }

    public ql n() {
        return ConversationFactory.o((JoinAnonByLinkParams) this.b);
    }

    public ParticipantId onExternalByInternalResolution(ConversationParticipant conversationParticipant) {
        return ((MultiEventListener) this.b).onExternalByInternalResolution(conversationParticipant);
    }

    public void updateMyExternalId(ParticipantId participantId) {
        ((ConversationParticipant) this.b).setExternalId(participantId);
    }

    public /* synthetic */ zx1(f44 f44, u2 u2Var) {
        this.a = 29;
        this.b = f44;
    }
}
