package defpackage;

import android.database.Cursor;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.PickerChatController;
import one.me.chats.picker.PickerChatsListWidget;
import one.me.chats.picker.chats.PickerChatsListWidget2;
import one.me.chats.picker.members.PickerMembersListWidget;
import one.me.mediapicker.MediaPickerScreen;
import one.me.members.list.MembersListWidget;
import one.me.messages.list.loader.MessageModel;
import one.me.messages.list.ui.contextmenu.MessageContextMenuBottomSheet;
import one.me.messages.settings.MessagesSettingsScreen;
import one.me.pinbars.PinBarsWidget;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.arch.Widget;
import one.me.startconversation.chat.PickChatMembers;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import ru.ok.tamtam.nano.Protos;

/* renamed from: e98  reason: default package */
public final /* synthetic */ class e98 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e98(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        xxa xxa;
        tt6 tt6;
        yr8 yr8;
        yyb yyb;
        pec pec;
        String str;
        int i;
        boolean z3;
        int i2;
        boolean z4;
        int i3;
        String str2;
        int i4;
        String str3;
        int i5;
        int i6;
        int i7;
        byte[] bArr;
        Long l;
        int i8;
        Boolean bool;
        long j = 0;
        jue jue = jue.a;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = MediaPickerScreen.F0;
                ((MediaPickerScreen) obj2).getRouter().C();
                return jue;
            case 1:
                return Boolean.valueOf(((qi8) ((si8) obj2)).a.contains(Long.valueOf(((ei8) obj).a)));
            case 2:
                return Boolean.valueOf(((Collection) obj2).contains(Long.valueOf(((ei8) obj).a)));
            case 3:
                MembersListWidget membersListWidget = (MembersListWidget) obj2;
                int intValue = ((Integer) obj).intValue() - membersListWidget.y0.j();
                cpf cpf = membersListWidget.x0;
                if (cpf.j() < intValue || intValue < 0) {
                    return null;
                }
                return (ei8) ((pg7) cpf.C(intValue));
            case 4:
                tf3 tf3 = (tf3) obj;
                l7c l7c = (l7c) obj2;
                return ((cl8) l7c.a).y(new bh2(fu7.t(tf3), fu7.m(((o2b) ((cl8) l7c.a).C0.getValue()).b(tf3.n())), 0));
            case 5:
                return ((cl8) obj2).y((bh2) obj);
            case 6:
                View view2 = (View) obj;
                k77[] k77Arr2 = MessagesSettingsScreen.Y;
                ((MessagesSettingsScreen) obj2).getRouter().C();
                return jue;
            case 7:
                iw6 iw6 = (iw6) obj;
                qhb qhb = (qhb) ((h49) obj2).g.getValue();
                qhb.getClass();
                return qhb.a(iw6.d, iw6.q);
            case 8:
                int intValue2 = ((Integer) obj).intValue();
                d1a d1a = ((f1a) obj2).a;
                if (d1a != null) {
                    d1a.c(intValue2);
                }
                return jue;
            case 9:
                of3 of3 = (of3) obj2;
                Float f = (Float) obj;
                float floatValue = f.floatValue();
                try {
                    of3.accept(f);
                } catch (Throwable th) {
                    udd.s("o6a", "Progress consumer has failed to accept the progress (" + floatValue + ") of media transform", th);
                }
                return jue;
            case 10:
                ((y7a) obj2).A0.setText(String.valueOf((CharSequence) obj));
                return Boolean.TRUE;
            case 11:
                return Boolean.valueOf(((View) obj).getId() != ((pea) obj2).getId());
            case Protos.Attaches.Attach.PRESENT /*12*/:
                View view3 = (View) obj;
                k77[] k77Arr3 = PickChatMembers.B0;
                ex9 onBackPressedDispatcher = ((PickChatMembers) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue;
            case 13:
                mpd mpd = (mpd) obj;
                mpd.a2();
                mpd.R1(mpd.Z1(((bqa) ((cqa) obj2)).a));
                return jue;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                View view4 = (View) obj;
                k77[] k77Arr4 = PickerChatController.F0;
                ex9 onBackPressedDispatcher2 = ((PickerChatController) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return jue;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                int intValue3 = ((Integer) obj).intValue();
                PickerChatsListWidget pickerChatsListWidget = (PickerChatsListWidget) obj2;
                gra gra = (f6c) o23.V(pickerChatsListWidget.x0.D());
                gra gra2 = pickerChatsListWidget.y0;
                if (gra != gra2) {
                    gra2 = pickerChatsListWidget.z0;
                }
                return Boolean.valueOf((gra2.j() <= intValue3 || intValue3 < 0) ? false : ((Set) ((xra) pickerChatsListWidget.a.getValue()).A0.a.getValue()).contains(Long.valueOf(((pg7) gra2.C(intValue3)).a)));
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                int intValue4 = ((Integer) obj).intValue();
                PickerChatsListWidget2 pickerChatsListWidget2 = (PickerChatsListWidget2) obj2;
                gra gra3 = (f6c) o23.V(pickerChatsListWidget2.A0.D());
                gra gra4 = pickerChatsListWidget2.B0;
                if (gra3 != gra4) {
                    gra4 = pickerChatsListWidget2.C0;
                }
                return Boolean.valueOf((gra4.j() <= intValue4 || intValue4 < 0) ? false : ((Set) pickerChatsListWidget2.n0().Z.a.getValue()).contains(Long.valueOf(((pg7) gra4.C(intValue4)).w0.a)));
            case LangUtils.HASH_SEED /*17*/:
                int intValue5 = ((Integer) obj).intValue();
                k77[] k77Arr5 = PickerMembersListWidget.B0;
                PickerMembersListWidget pickerMembersListWidget = (PickerMembersListWidget) obj2;
                CharSequence charSequence = (CharSequence) pickerMembersListWidget.n0().y0.a.getValue();
                if (charSequence == null || charSequence.length() == 0) {
                    z2 = true;
                    z = true;
                } else {
                    z = false;
                    z2 = true;
                }
                if (!(z2 ^ z)) {
                    gra gra5 = pickerMembersListWidget.Y;
                    if (intValue5 < gra5.j()) {
                        return ((pg7) gra5.C(intValue5)).c;
                    }
                }
                return null;
            case 18:
                x49 x49 = (x49) obj;
                int i9 = PinBarsWidget.x0;
                PinBarsWidget pinBarsWidget = (PinBarsWidget) obj2;
                View view5 = pinBarsWidget.getView();
                if (view5 != null) {
                    lp.K(view5, ie6.CONFIRM);
                }
                sua l0 = pinBarsWidget.l0();
                int ordinal = x49.ordinal();
                if (ordinal == 0) {
                    xxa = xxa.c;
                } else if (ordinal == 1) {
                    xxa = xxa.o;
                } else if (ordinal == 2) {
                    xxa = xxa.X;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                rya rya = l0.A0;
                rya.getClass();
                pz4 pz4 = xxa.Z;
                float f2 = ((xxa) pz4.get((xxa.ordinal() + 1) % pz4.getSize())).a;
                nb9 nb9 = (nb9) rya.b;
                nb9.getClass();
                xs7.E(nb9.h, (hu3) null, (ru3) null, new kb9(nb9, f2, (Continuation) null), 3);
                return jue;
            case 19:
                View view6 = (View) obj;
                ((hva) obj2).Q0.invoke();
                return jue;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                Throwable th2 = (Throwable) obj;
                rya rya2 = (rya) obj2;
                ((nb9) rya2.b).s(rya2.g);
                return jue;
            case 21:
                int intValue6 = ((Integer) obj).intValue();
                StringBuilder sb = new StringBuilder();
                wza wza = (wza) obj2;
                sb.append(wza.e[intValue6]);
                sb.append(": ");
                sb.append(wza.i(intValue6).a());
                return sb.toString();
            case 22:
                View view7 = (View) obj;
                k77[] k77Arr6 = ProfileChangeLinkScreen.z0;
                ex9 onBackPressedDispatcher3 = ((ProfileChangeLinkScreen) obj2).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return jue;
            case 23:
                s8b s8b = (s8b) obj;
                s8b.P1().b(":chat-list", (Bundle) null);
                s8b.P1().b(us8.i(((b6b) ((g6b) obj2)).b, ":start-conversation/add-subscribers?id="), (Bundle) null);
                return jue;
            case 24:
                LinearLayout linearLayout = (LinearLayout) obj;
                k77[] k77Arr7 = ProfileInviteScreen.Y;
                nea nea = new nea(linearLayout.getContext(), 6);
                nea.setLayoutParams(new re3(-1, -2));
                nea.setTitle(l8a.o);
                nea.setForm(fea.a);
                nea.setTextShimmerEnabled(false);
                nea.setLeftActions(new vda(new qq9(20)));
                linearLayout.addView(nea);
                RecyclerView recyclerView = new RecyclerView(linearLayout.getContext(), (AttributeSet) null);
                recyclerView.setLayoutParams(new re3(-1, -1));
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setClipToPadding(false);
                recyclerView.setClipChildren(false);
                recyclerView.setPaddingRelative(recyclerView.getPaddingStart(), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density), recyclerView.getPaddingEnd(), recyclerView.getPaddingBottom());
                ProfileInviteScreen profileInviteScreen = (ProfileInviteScreen) obj2;
                recyclerView.setAdapter(profileInviteScreen.o);
                recyclerView.setItemAnimator((k6c) null);
                ub9 ub9 = gz6.a;
                ub9 ub92 = new ub9(1);
                ub92.g(4);
                recyclerView.j(new qtc(km4.y0.r(recyclerView), new w48(profileInviteScreen, 20, ub92), (o8) null, 12));
                float f3 = (float) 12;
                recyclerView.j(new ku7(zy6.a(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(((float) 24) * dh4.c().getDisplayMetrics().density), a24.X(f3 * dh4.c().getDisplayMetrics().density)), zy6.a(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), 0), zy6.a(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), 0), 1));
                linearLayout.addView(recyclerView);
                return jue;
            case 25:
                pda pda = (pda) obj;
                return Integer.valueOf(((ow6) obj2).a);
            case 26:
                fzb fzb = (fzb) obj;
                qzb qzb = ((rzb) obj2).b;
                if (qzb != null) {
                    MessageContextMenuBottomSheet messageContextMenuBottomSheet = (MessageContextMenuBottomSheet) qzb;
                    MessageModel B0 = messageContextMenuBottomSheet.B0();
                    long j2 = B0 != null ? B0.a : 0;
                    if (B0 != null) {
                        j = B0.b;
                    }
                    ((k0c) messageContextMenuBottomSheet.U0.getValue()).q().l(new d0c(fzb.b, j2, j, B0 != null ? B0.E0 : null));
                    messageContextMenuBottomSheet.r0(true);
                    if (!hhd.f((B0 == null || (yr8 = B0.E0) == null || (yyb = yr8.c) == null) ? null : yyb.b, fzb.b) && (tt6 = (tt6) xv8.a.getAccessor().e()) != null) {
                        tt6.f(Collections.singleton(new st6(qt6.X, 1)), mnc.CHAT);
                    }
                }
                return jue;
            case 27:
                udc udc = (udc) obj2;
                udc.getClass();
                return udc.c(udc, (Continuation) obj);
            case 28:
                List<Long> list = (List) obj;
                cw8 d = ((nec) obj2).d();
                d.getClass();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("SELECT * FROM messages WHERE id in (");
                int size = list.size();
                a06.e(sb2, size);
                sb2.append(") AND inserted_from_msg_link = 0 AND status <> ");
                sb2.append("?");
                int i10 = size + 1;
                pec a2 = pec.a(i10, sb2.toString());
                int i11 = 1;
                for (Long l2 : list) {
                    if (l2 == null) {
                        a2.W(i11);
                    } else {
                        a2.j(i11, l2.longValue());
                    }
                    i11++;
                }
                d.a().getClass();
                a2.j(i10, (long) 10);
                aec aec = d.a;
                aec.b();
                Cursor o = aec.o(a2, (CancellationSignal) null);
                try {
                    int o2 = gp0.o(o, ApiProtocol.KEY_ID);
                    int o3 = gp0.o(o, "server_id");
                    int o4 = gp0.o(o, "time");
                    int o5 = gp0.o(o, "update_time");
                    int o6 = gp0.o(o, "sender");
                    int o7 = gp0.o(o, "cid");
                    int o8 = gp0.o(o, "text");
                    int o9 = gp0.o(o, "delivery_status");
                    int o10 = gp0.o(o, "status");
                    int o11 = gp0.o(o, "time_local");
                    int o12 = gp0.o(o, "error");
                    int o13 = gp0.o(o, "localized_error");
                    int o14 = gp0.o(o, "attaches");
                    pec = a2;
                    try {
                        int o15 = gp0.o(o, "media_type");
                        int o16 = gp0.o(o, "detect_share");
                        int o17 = gp0.o(o, "msg_link_type");
                        int o18 = gp0.o(o, "msg_link_id");
                        int o19 = gp0.o(o, "inserted_from_msg_link");
                        int o20 = gp0.o(o, "msg_link_chat_id");
                        int o21 = gp0.o(o, "msg_link_chat_name");
                        int o22 = gp0.o(o, "msg_link_chat_link");
                        int o23 = gp0.o(o, "msg_link_out_chat_id");
                        int o24 = gp0.o(o, "msg_link_out_msg_id");
                        int o25 = gp0.o(o, "type");
                        int o26 = gp0.o(o, "chat_id");
                        int o27 = gp0.o(o, "ttl");
                        int o28 = gp0.o(o, "channel_views");
                        int o29 = gp0.o(o, "channel_forwards");
                        int o30 = gp0.o(o, "view_time");
                        int o31 = gp0.o(o, "zoom");
                        int o32 = gp0.o(o, "options");
                        int o33 = gp0.o(o, "live_until");
                        int o34 = gp0.o(o, "elements");
                        int o35 = gp0.o(o, "reactions");
                        int o36 = gp0.o(o, "delayed_attrs_time_to_fire");
                        int o37 = gp0.o(o, "delayed_attrs_notify_sender");
                        int i12 = o14;
                        ArrayList arrayList = new ArrayList(o.getCount());
                        while (o.moveToNext()) {
                            long j3 = o.getLong(o2);
                            long j4 = o.getLong(o3);
                            long j5 = o.getLong(o4);
                            long j6 = o.getLong(o5);
                            long j7 = o.getLong(o6);
                            long j8 = o.getLong(o7);
                            String string = o.isNull(o8) ? null : o.getString(o8);
                            int i13 = o.getInt(o9);
                            d.a().getClass();
                            bp8.b.getClass();
                            bp8 t = s59.t(i13);
                            int i14 = o.getInt(o10);
                            d.a().getClass();
                            ls8 b2 = p29.b(i14);
                            long j9 = o.getLong(o11);
                            String string2 = o.isNull(o12) ? null : o.getString(o12);
                            if (o.isNull(o13)) {
                                i = i12;
                                str = null;
                            } else {
                                str = o.getString(o13);
                                i = i12;
                            }
                            byte[] blob = o.isNull(i) ? null : o.getBlob(i);
                            d.a().getClass();
                            jj7 b3 = fu7.b(blob);
                            int i15 = o2;
                            int i16 = o15;
                            int i17 = o.getInt(i16);
                            o15 = i16;
                            int i18 = o16;
                            if (o.getInt(i18) != 0) {
                                o16 = i18;
                                i2 = o17;
                                z3 = true;
                            } else {
                                o16 = i18;
                                i2 = o17;
                                z3 = false;
                            }
                            int i19 = o.getInt(i2);
                            o17 = i2;
                            int i20 = o18;
                            long j10 = o.getLong(i20);
                            o18 = i20;
                            int i21 = o19;
                            if (o.getInt(i21) != 0) {
                                o19 = i21;
                                i3 = o20;
                                z4 = true;
                            } else {
                                o19 = i21;
                                i3 = o20;
                                z4 = false;
                            }
                            long j11 = o.getLong(i3);
                            o20 = i3;
                            int i22 = o21;
                            if (o.isNull(i22)) {
                                o21 = i22;
                                i4 = o22;
                                str2 = null;
                            } else {
                                str2 = o.getString(i22);
                                o21 = i22;
                                i4 = o22;
                            }
                            if (o.isNull(i4)) {
                                o22 = i4;
                                i5 = o23;
                                str3 = null;
                            } else {
                                str3 = o.getString(i4);
                                o22 = i4;
                                i5 = o23;
                            }
                            long j12 = o.getLong(i5);
                            o23 = i5;
                            int i23 = o24;
                            long j13 = o.getLong(i23);
                            o24 = i23;
                            int i24 = o25;
                            int i25 = o.getInt(i24);
                            d.a().getClass();
                            int a3 = us8.a(i25);
                            o25 = i24;
                            int i26 = o26;
                            long j14 = o.getLong(i26);
                            o26 = i26;
                            int i27 = o27;
                            int i28 = o.getInt(i27);
                            o27 = i27;
                            int i29 = o28;
                            int i30 = o.getInt(i29);
                            o28 = i29;
                            int i31 = o29;
                            int i32 = o.getInt(i31);
                            o29 = i31;
                            int i33 = o30;
                            long j15 = o.getLong(i33);
                            o30 = i33;
                            int i34 = o31;
                            int i35 = o.getInt(i34);
                            o31 = i34;
                            int i36 = o32;
                            int i37 = o.getInt(i36);
                            o32 = i36;
                            int i38 = o33;
                            long j16 = o.getLong(i38);
                            o33 = i38;
                            int i39 = o34;
                            byte[] blob2 = o.isNull(i39) ? null : o.getBlob(i39);
                            d.a().getClass();
                            List a4 = p29.a(blob2);
                            o34 = i39;
                            int i40 = o35;
                            if (o.isNull(i40)) {
                                i6 = i40;
                                i7 = o13;
                                bArr = null;
                            } else {
                                i6 = i40;
                                bArr = o.getBlob(i40);
                                i7 = o13;
                            }
                            yr8 c = d.a().c(bArr);
                            int i41 = o36;
                            if (o.isNull(i41)) {
                                i8 = o37;
                                l = null;
                            } else {
                                l = Long.valueOf(o.getLong(i41));
                                i8 = o37;
                            }
                            Integer valueOf = o.isNull(i8) ? null : Integer.valueOf(o.getInt(i8));
                            if (valueOf == null) {
                                o36 = i41;
                                bool = null;
                            } else {
                                bool = Boolean.valueOf(valueOf.intValue() != 0);
                                o36 = i41;
                            }
                            arrayList.add(new jp8(j3, j4, j5, j6, j7, j8, string, t, b2, j9, string2, str, b3, i17, z3, i19, j10, z4, j11, str2, str3, j12, j13, a3, j14, i28, i30, i32, j15, i35, i37, j16, a4, c, l, bool));
                            o37 = i8;
                            o13 = i7;
                            o2 = i15;
                            o35 = i6;
                            i12 = i;
                        }
                        o.close();
                        pec.m();
                        return arrayList;
                    } catch (Throwable th3) {
                        th = th3;
                        o.close();
                        pec.m();
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    pec = a2;
                    o.close();
                    pec.m();
                    throw th;
                }
            default:
                Throwable th5 = (Throwable) obj;
                ((xi4) obj2).f();
                return jue;
        }
    }

    public /* synthetic */ e98(Widget widget, Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
