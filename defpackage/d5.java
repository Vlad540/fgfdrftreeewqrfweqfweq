package defpackage;

import android.os.Bundle;
import android.text.Editable;
import android.util.Base64;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.widget.AppCompatEditText;
import java.nio.charset.StandardCharsets;
import java.util.HashSet;
import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.ratecall.CallRateBottomSheet;
import one.me.calls.ui.ui.call.CallScreen;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;
import one.me.calls.ui.ui.indicator.CallIndicatorWidget;
import one.me.chats.list.ChatsListWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chatscreen.mediabar.MediaBarWidget;
import one.me.folders.edit.FolderEditScreen;
import one.me.login.confirm.ConfirmPhoneScreen;
import one.me.profile.screens.addmembers.AddChatMembersScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.contextmenu.popup.ContextMenuPopupWindow;
import one.me.sdk.messagewrite.markdown.AddLinkBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.messages.contacts.profile.ActContactAvatars;
import ru.ok.messages.media.attaches.ActAttachesView;
import ru.ok.messages.media.mediabar.ActLocalMedias;
import ru.ok.messages.messages.widgets.ChatMsgSearchResultView;
import ru.ok.messages.settings.ActSettings;
import ru.ok.messages.views.ActProfilePhoto;
import ru.ok.tamtam.nano.Protos;

/* renamed from: d5  reason: default package */
public final /* synthetic */ class d5 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void onClick(View view) {
        int i;
        boolean z;
        qf1 qf1;
        hw4 hw4;
        String str;
        int i2;
        MediaBarWidget mediaBarWidget;
        int i3 = 0;
        qod qod = null;
        switch (this.a) {
            case 0:
                HashSet hashSet = ActAttachesView.D1;
                ((ActAttachesView) this.b).onBackPressed();
                return;
            case 1:
                int i4 = ActContactAvatars.l1;
                ((ActContactAvatars) this.b).finish();
                return;
            case 2:
                int i5 = ActLocalMedias.w1;
                ((ActLocalMedias) this.b).onBackPressed();
                return;
            case 3:
                int i6 = ActProfilePhoto.c1;
                ((ActProfilePhoto) this.b).finish();
                return;
            case 4:
                int i7 = ActSettings.Z0;
                ActSettings actSettings = (ActSettings) this.b;
                vx5 P = actSettings.P();
                if (P.d.size() + (P.h != null ? 1 : 0) > 0) {
                    vx5 P2 = actSettings.P();
                    P2.getClass();
                    P2.y(new tx5(P2, -1, 0), false);
                    return;
                }
                actSettings.finish();
                return;
            case 5:
                k77[] k77Arr = AddChatMembersScreen.B0;
                rr3 rr3 = (AddChatMembersScreen) this.b;
                if (rr3.u0().c.h) {
                    rr3.i(j8a.j, (Bundle) null);
                    return;
                }
                k77[] k77Arr2 = BottomSheetWidget.B0;
                jc3 c = rf0.c(cic.U, 6, (Bundle) null);
                c.a(new kc3(j8a.j, new hge(cic.W), 2, false));
                c.a(new kc3(j8a.i, new hge(cic.V), 2, false));
                c.a(new kc3(j8a.h, new hge(cic.r), 2, false));
                c.a.putBoolean("memorize_keyboard", false);
                ConfirmationBottomSheet e = c.e();
                e.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                sgc S = ygc != null ? ygc.S() : null;
                e.y0(rr3);
                if (S != null) {
                    vgc vgc = new vgc(e, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    S.G(vgc);
                    return;
                }
                return;
            case 6:
                k77[] k77Arr3 = AddLinkBottomSheet.A0;
                AddLinkBottomSheet addLinkBottomSheet = (AddLinkBottomSheet) this.b;
                addLinkBottomSheet.r0(true);
                vu7 vu7 = (vu7) addLinkBottomSheet.z0.getValue();
                String valueOf = String.valueOf(((AppCompatEditText) addLinkBottomSheet.x0.T0(addLinkBottomSheet, AddLinkBottomSheet.A0[1])).getText());
                aa aaVar = addLinkBottomSheet.w0;
                int i8 = aaVar.a;
                vu7.getClass();
                taf.o(vu7.b, new aa(i8, aaVar.b, valueOf));
                return;
            case 7:
                ((ma) this.b).g();
                return;
            case 8:
                ((r51) this.b).N0.e(0, false);
                return;
            case 9:
                k77[] k77Arr4 = CallIndicatorWidget.X;
                CallIndicatorWidget callIndicatorWidget = (CallIndicatorWidget) this.b;
                bm3.q(callIndicatorWidget.requireActivity());
                d81 d81 = (d81) callIndicatorWidget.o.getValue();
                ep1 ep1 = d81.c;
                String str2 = "";
                if (ep1.r()) {
                    ete ete = ep1.k().a;
                    boolean z2 = ete != null && ete.P();
                    k11 k11 = (k11) d81.b.k.getValue();
                    oc1 oc1 = oc1.c;
                    Long l = k11.a;
                    long longValue = l != null ? l.longValue() : 0;
                    CharSequence charSequence = k11.b;
                    String obj = charSequence != null ? charSequence.toString() : null;
                    if (obj != null) {
                        str2 = obj;
                    }
                    String str3 = k11.c;
                    String encodeToString = str3 != null ? Base64.encodeToString(str3.getBytes(StandardCharsets.UTF_8), 0) : null;
                    d34 P1 = oc1.P1();
                    StringBuilder j = m4b.j(":call-incoming?chat_id=", longValue, "&call_name=", str2);
                    j.append("&call_avatar=");
                    j.append(encodeToString);
                    j.append("&video_enabled=");
                    j.append(z2);
                    P1.b(j.toString(), (Bundle) null);
                    return;
                }
                oc1.c.P1().b(":call-active?place=".concat(str2), (Bundle) null);
                return;
            case 10:
                i91 i91 = ((j91) this.b).a;
                if (i91 != null) {
                    i91.j();
                    return;
                }
                return;
            case 11:
                k77[] k77Arr5 = CallRateBottomSheet.M0;
                CallRateBottomSheet callRateBottomSheet = (CallRateBottomSheet) this.b;
                qf1 A0 = callRateBottomSheet.A0();
                char c2 = 7;
                String text = ((jx3) callRateBottomSheet.L0.T0(callRateBottomSheet, CallRateBottomSheet.M0[7])).getText();
                A0.getClass();
                String str4 = (text == null || text.length() == 0) ^ true ? text : null;
                grd grd = A0.Z;
                Integer num = ((of1) grd.getValue()).a;
                int i9 = o1a.y0;
                if (num != null && num.intValue() == i9) {
                    i = 1;
                } else {
                    int i10 = o1a.x0;
                    if (num != null && num.intValue() == i10) {
                        i = 2;
                    } else {
                        int i11 = o1a.w0;
                        if (num != null && num.intValue() == i11) {
                            i = 3;
                        } else {
                            return;
                        }
                    }
                }
                ub9 ub9 = ((of1) grd.getValue()).b;
                int[] iArr = ub9.b;
                long[] jArr = ub9.a;
                int length = jArr.length - 2;
                long j2 = 128;
                qf1 qf12 = A0;
                if (length >= 0) {
                    while (true) {
                        long j3 = jArr[i3];
                        if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i3 - length)) >>> 31);
                            int i13 = 0;
                            while (i13 < i12) {
                                if ((j3 & 255) < j2) {
                                    int i14 = iArr[(i3 << 3) + i13];
                                    uxb.b.getClass();
                                    if (smc.o(i14) == uxb.B0) {
                                        hw4 = hw4.a;
                                        z = true;
                                        qf1 = qf12;
                                    }
                                }
                                j3 >>= 8;
                                i13++;
                                j2 = 128;
                            }
                            i2 = 1;
                            if (i12 != 8) {
                            }
                        } else {
                            i2 = 1;
                        }
                        if (i3 != length) {
                            i3 += i2;
                            j2 = 128;
                        }
                    }
                }
                lg7 c3 = hwf.c();
                qf1 = qf12;
                List list = qf1.o;
                if (list != null) {
                    c3.addAll(list);
                }
                ub9 ub92 = ((of1) grd.getValue()).b;
                int[] iArr2 = ub92.b;
                long[] jArr2 = ub92.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j4 = jArr2[i15];
                        if ((((~j4) << c2) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                            int i16 = 8 - ((~(i15 - length2)) >>> 31);
                            for (int i17 = 0; i17 < i16; i17++) {
                                if ((j4 & 255) < 128) {
                                    int i18 = iArr2[(i15 << 3) + i17];
                                    uxb.b.getClass();
                                    uxb o = smc.o(i18);
                                    if (!(o == null || (str = o.a) == null)) {
                                        c3.add(str);
                                    }
                                }
                                j4 >>= 8;
                            }
                            z = true;
                            if (i16 != 8) {
                            }
                        } else {
                            z = true;
                        }
                        if (i15 != length2) {
                            i15 += z ? 1 : 0;
                            c2 = 7;
                        }
                    }
                } else {
                    z = true;
                }
                hw4 = hwf.a(c3);
                if (!(hw4.isEmpty() ^ z)) {
                    hw4 = null;
                }
                String obj2 = hw4 != null ? hw4.toString() : null;
                iq1 iq1 = (iq1) qf1.Y.getValue();
                iq1.getClass();
                iq1.c(iq1, "CALL_REVIEW", qf1.b, obj2, Integer.valueOf(i), str4, (String) null, false, 96);
                taf.o(qf1.D0, kf1.a);
                return;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                lhd lhd = ((hl1) this.b).K0;
                if (lhd != null) {
                    k77[] k77Arr6 = CallTopPanelWidget.o;
                    taf.o(((CallTopPanelWidget) lhd.b).m0().b.Q0, oh1.C);
                    return;
                }
                return;
            case 13:
                gm1 gm1 = (gm1) this.b;
                yg1 yg1 = gm1.j1;
                if (yg1 != null) {
                    le1 le1 = gm1.m1;
                    smc smc = CallScreen.T0;
                    yg1.a.z0().v(le1);
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                lt1 lt1 = (lt1) this.b;
                vkb vkb = lt1.a;
                if (vkb == null) {
                    vkb = null;
                }
                qod qod2 = vkb.o;
                if (qod2 != null) {
                    qod = qod2;
                }
                boolean h = qod.C0.h();
                if (!h) {
                    taf.o(qod.A0, okb.a);
                }
                if (h) {
                    boolean z3 = !lt1.D0;
                    lt1.a(z3, true);
                    if (z3 && (mediaBarWidget = lt1.C0) != null) {
                        xg9.g(mediaBarWidget.o, mnc.CHAT_ATTACH_PICKER_CAMERA);
                        return;
                    }
                    return;
                }
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                ((fx1) this.b).J0.invoke();
                return;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                bqc bqc = BaseBottomSheetWidget.X;
                ((ChangeDisabledDialog) this.b).r0(true);
                return;
            case LangUtils.HASH_SEED /*17*/:
                int i19 = ChatMsgSearchResultView.P0;
                ((ChatMsgSearchResultView) this.b).getClass();
                return;
            case 18:
                k77[] k77Arr7 = ChatsListWidget.O0;
                zu2.c.P1().b(":settings/folder/members-picker?folder_id=".concat(((ChatsListWidget) this.b).b), (Bundle) null);
                return;
            case 19:
                ((ow2) this.b).V0.toggle();
                return;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                wz2 wz2 = (wz2) this.b;
                EditText editText = wz2.i;
                if (editText != null) {
                    Editable text2 = editText.getText();
                    if (text2 != null) {
                        text2.clear();
                    }
                    wz2.q();
                    return;
                }
                return;
            case 21:
                k77[] k77Arr8 = ConfirmPhoneScreen.G0;
                rb3 q0 = ((ConfirmPhoneScreen) this.b).q0();
                q0.G0 = null;
                q0.b.a(q0.a, ((pae) q0.x0.getValue()).b(), ru3.a, new nb3(q0, (Continuation) null));
                return;
            case 22:
                vn3 vn3 = (vn3) this.b;
                vn3.J0.t();
                vn3.K0.a(2, 3, 2);
                return;
            case 23:
                k77[] k77Arr9 = ContactsPickerScreen.z0;
                xo3 xo3 = ((ContactsPickerScreen) this.b).u0().c;
                ou3 ou3 = xo3.d;
                if (ou3 != null) {
                    qod = xs7.D(ou3, ((pae) xo3.c.getValue()).b(), ru3.b, new wo3(xo3, (Continuation) null));
                }
                xo3.e.o1(xo3, xo3.h[0], qod);
                return;
            case 24:
                ((ContextMenuPopupWindow) this.b).dismiss();
                return;
            case 25:
                ((gg4) this.b).a.invoke();
                return;
            case 26:
                ((kp4) this.b).u();
                return;
            case 27:
                taf.o(((np5) this.b).m0().B0, sp5.a);
                return;
            case 28:
                k77[] k77Arr10 = FolderEditScreen.w0;
                ((FolderEditScreen) this.b).i(d5a.d, (Bundle) null);
                return;
            default:
                ((s16) ((h41) this.b).K0).invoke();
                return;
        }
    }

    public /* synthetic */ d5(hl1 hl1, View view) {
        this.a = 12;
        this.b = hl1;
    }
}
