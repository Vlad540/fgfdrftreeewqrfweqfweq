package defpackage;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import one.me.android.join.JoinChatWidget;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inappreview.ui.FakeInAppReviewBottomSheet;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;
import one.me.main.MainScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.phoneutils.SelectCountryBottomSheet;
import one.me.sdk.richvector.EnhancedAnimatedVectorDrawable;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.android.emoji.font.LoadEmojiFontWorker;
import ru.ok.tamtam.nano.Protos;
import ru.ok.tamtam.upload.workers.ForegroundWorker;

/* renamed from: gz3  reason: default package */
public final /* synthetic */ class gz3 implements s16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gz3(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final Object invoke() {
        Set set;
        d4b d4b;
        n6g n6g;
        boolean z = false;
        sgc sgc = null;
        jue jue = jue.a;
        Object obj = this.b;
        switch (this.a) {
            case 0:
                return (c9a) obj;
            case 1:
                ((n14) obj).b = true;
                return jue;
            case 2:
                ((j2b) ((rf4) obj).b).b.getClass();
                return cqc.b;
            case 3:
                ((vj4) obj).d();
                return jue;
            case 4:
                cv4 cv4 = (cv4) obj;
                return Float.valueOf((cv4.a() / ((float) 11)) + cv4.a());
            case 5:
                return EnhancedAnimatedVectorDrawable.animatorListener_delegate$lambda$0((EnhancedAnimatedVectorDrawable) obj);
            case 6:
                qz4 qz4 = (qz4) obj;
                nz4 nz4 = qz4.b;
                if (nz4 == null) {
                    Enum[] enumArr = qz4.a;
                    nz4 = new nz4(enumArr.length);
                    for (Enum name : enumArr) {
                        nz4.k(name.name(), false);
                    }
                }
                return nz4;
            case 7:
                ((jg8) obj).b = null;
                return jue;
            case 8:
                k77[] k77Arr = FakeInAppReviewBottomSheet.L0;
                FakeInAppReviewBottomSheet fakeInAppReviewBottomSheet = (FakeInAppReviewBottomSheet) obj;
                return new RippleDrawable(ColorStateList.valueOf(km4.y0.n(fakeInAppReviewBottomSheet.getContext()).g().c().a.b), fakeInAppReviewBottomSheet.G0, fakeInAppReviewBottomSheet.E0);
            case 9:
                List list = (List) obj;
                Iterator it = myc.L(new es(2, list), new t13(18)).iterator();
                if (!it.hasNext()) {
                    set = qw4.a;
                } else {
                    Long valueOf = Long.valueOf(((cb5) it.next()).f);
                    if (!it.hasNext()) {
                        set = Collections.singleton(valueOf);
                    } else {
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        linkedHashSet.add(valueOf);
                        while (it.hasNext()) {
                            linkedHashSet.add(Long.valueOf(((cb5) it.next()).f));
                        }
                        set = linkedHashSet;
                    }
                }
                int S = ju7.S(q23.H(set, 10));
                if (S < 16) {
                    S = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(S);
                for (Object next : set) {
                    long longValue = ((Number) next).longValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        cb5 cb5 = (cb5) listIterator.previous();
                        if (cb5.f == longValue) {
                            linkedHashMap.put(next, cb5);
                        }
                    }
                    throw new NoSuchElementException("List contains no element matching the predicate.");
                }
                return linkedHashMap;
            case 10:
                return new xe5((ye5) obj);
            case 11:
                return new hj5((ij5) obj);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                k77[] k77Arr2 = FolderEditScreen.w0;
                k77[] k77Arr3 = FolderEditScreen.w0;
                k77 k77 = k77Arr3[0];
                FolderEditScreen folderEditScreen = (FolderEditScreen) obj;
                k77 k772 = k77Arr3[1];
                return new rq5((String) folderEditScreen.b.a(folderEditScreen), ((Number) folderEditScreen.c.a(folderEditScreen)).longValue());
            case 13:
                k77[] k77Arr4 = FolderMemberPickerScreen.C0;
                int i = e87.a;
                if (e87.b(e87.c)) {
                    bm3.p((FolderMemberPickerScreen) obj);
                }
                return jue;
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return ((j2b) ((nqc) ((ForegroundWorker) obj).getTamComponent()).q()).b;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return new ir6((hr6) ((az5) obj).e.getValue()).f();
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                return new q56((m66) obj);
            case LangUtils.HASH_SEED /*17*/:
                return c76.a((c76) obj);
            case 18:
                return new db6((eb6) obj);
            case 19:
                return ((jh6) obj).a.k();
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                wt6 wt6 = (wt6) obj;
                e83 e83 = wt6.a;
                if (!(e83 == null || (d4b = wt6.b) == null)) {
                    if (!e83.isDestroyed() && !e83.isFinishing()) {
                        t0g t0g = wt6.c;
                        if (t0g != null) {
                            e83 e832 = wt6.a;
                            if (e832 != null) {
                                Intent intent = new Intent("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE");
                                intent.setPackage("com.android.vending");
                                z = !e832.getPackageManager().queryIntentServices(intent, 128).isEmpty();
                            }
                            if (z) {
                                t0g t0g2 = t0g;
                                if (t0g2.b) {
                                    n6g = gwf.o((Object) null);
                                } else {
                                    Intent intent2 = new Intent(e83, PlayCoreDialogWrapperActivity.class);
                                    intent2.putExtra("confirmation_intent", t0g2.a);
                                    intent2.putExtra("window_flags", e83.getWindow().getDecorView().getWindowSystemUiVisibility());
                                    vde vde = new vde();
                                    intent2.putExtra("result_receiver", new t38(2, (Handler) d4b.c, vde));
                                    e83.startActivity(intent2);
                                    n6g = vde.a;
                                }
                                vt6 vt6 = new vt6(wt6, 1);
                                n6g.getClass();
                                c27 c27 = cee.a;
                                n6g.c(c27, vt6);
                                n6g.a(c27, new vt6(wt6, 2));
                                n6g.i(new vt6(wt6, 3));
                            } else if (wt6.d != null) {
                                xhd.i();
                            }
                        } else if (wt6.d != null) {
                            xhd.i();
                        }
                    } else if (wt6.d != null) {
                        xhd.i();
                    }
                }
                return jue;
            case 21:
                udd.q(bv6.I0, "ManualGalleryContentObserver: on content changed");
                ((bv6) obj).e();
                return jue;
            case 22:
                k77[] k77Arr5 = InviteByPhoneScreen.F0;
                k77[] k77Arr6 = BottomSheetWidget.B0;
                SelectCountryBottomSheet selectCountryBottomSheet = new SelectCountryBottomSheet(jjd.j(new wia[]{new wia("is_narnia_available", Boolean.FALSE)}));
                rr3 rr3 = (InviteByPhoneScreen) obj;
                selectCountryBottomSheet.setTargetController(rr3);
                rr3 rr32 = rr3;
                while (rr32.getParentController() != null) {
                    rr32 = rr32.getParentController();
                }
                ygc ygc = rr32 instanceof ygc ? (ygc) rr32 : null;
                if (ygc != null) {
                    sgc = ygc.S();
                }
                selectCountryBottomSheet.y0(rr3);
                if (sgc != null) {
                    vgc vgc = new vgc(selectCountryBottomSheet, (String) null, (wr3) null, (wr3) null, false, -1);
                    rf0.k(false, vgc, true, "BottomSheetWidget");
                    sgc.G(vgc);
                }
                return jue;
            case 23:
                k77[] k77Arr7 = InviteByQrBottomSheet.I0;
                InviteByQrBottomSheet inviteByQrBottomSheet = (InviteByQrBottomSheet) obj;
                hba hba = new hba((Widget) inviteByQrBottomSheet);
                hba.i(inviteByQrBottomSheet.getContext().getString(rhc.f));
                hba.f(new vba(phc.J));
                return hba;
            case 24:
                k77 k773 = JoinChatWidget.B0[1];
                JoinChatWidget joinChatWidget = (JoinChatWidget) obj;
                return new w47((String) joinChatWidget.w0.a(joinChatWidget));
            case 25:
                sr7 sr7 = sr7.c;
                String str = ((je7) ((ne7) obj)).a;
                d34 P1 = sr7.P1();
                mn mnVar = new mn(12);
                mnVar.b = ":call-join-preview";
                mnVar.T(str, "link");
                P1.c(mnVar.u(), (Bundle) null);
                return jue;
            case 26:
                return LoadEmojiFontWorker.emojiFontLoadingNotifications_delegate$lambda$0((LoadEmojiFontWorker) obj);
            case 27:
                k77[] k77Arr8 = LogsViewerScreen.Y;
                LogsViewerScreen logsViewerScreen = (LogsViewerScreen) obj;
                nea nea = new nea(logsViewerScreen.getContext(), 6);
                nea.setId(LogsViewerScreen.Z);
                nea.setTitle((CharSequence) "Логи");
                nea.setForm(fea.a);
                nea.setLeftActions(new vda(new gw2(27, logsViewerScreen)));
                return nea;
            case 28:
                j06 j06 = MainScreen.Z;
                String string = ((MainScreen) obj).getArgs().getString("main:arg:deep_link");
                if (string == null) {
                    string = "";
                }
                return new ls7(((j2b) nqc.a.q()).c, (qp0) yr7.a.getAccessor().c(qp0.class), string);
            default:
                return (o94) ((uj8) obj).X.invoke();
        }
    }
}
