package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import me.leolin.shortcutbadger.BuildConfig;
import one.me.android.deeplink.LinkInterceptorWidget;
import one.me.android.join.JoinChatWidget;
import one.me.chats.picker.contacts.ContactsPickerScreen;
import one.me.chats.tab.ChatsTabWidget;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.devmenu.logsviewer.LogsViewerScreen;
import one.me.folders.edit.FolderEditScreen;
import one.me.folders.list.FoldersListScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.keyboardmedia.MediaKeyboardWidget;
import one.me.keyboardmedia.emoji.KeyboardEmojiWidget;
import one.me.keyboardmedia.stickers.KeyboardStickersWidget;
import one.me.profile.screens.avatars.ContactAvatarsScreen;
import one.me.rlottie.RLottie;
import one.me.sdk.contextmenu.bottomsheet.ContextMenuBottomSheet;
import one.me.sdk.media.ffmpeg.WebmConfig;
import one.me.webview.FaqWebViewWidget;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.participant.collection.ParticipantStore;
import ru.ok.messages.a;
import ru.ok.messages.contacts.profile.FrgContactAvatarsLoader;

/* renamed from: gw2  reason: default package */
public final /* synthetic */ class gw2 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gw2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj) {
        bve bve = (bve) obj;
        eg4 eg4 = (eg4) this.b;
        bve.e(Application.class, new dg4(eg4, 0));
        bve.e(Context.class, new dg4(eg4, 1));
        bve.e(k93.class, new ia7(3));
        bve.e(oae.class, new ia7(14));
        bve.e(pu4.class, new ia7(25));
        bve.e(ed3.class, new ja7(6));
        bve.e(up8.class, new ja7(9));
        bve.e(bl7.class, new ja7(10));
        bve.e(oa7.class, new ja7(11));
        bve.e(cla.class, new ja7(12));
        bve.e(knc.class, new ja7(13));
        bve.e(ka7.class, new z93(23));
        bve.e(pbe.class, new z93(24));
        bve.e(fp.class, new z93(25));
        bve.e(cyc.class, new z93(26));
        bve.e(s98.class, new z93(27));
        bve.e(jr0.class, new z93(28));
        bve.e(pge.class, new z93(29));
        bve.e(wk7.class, new ia7(0));
        bve.e(pwc.class, new ia7(1));
        bve.e(l8f.class, new ia7(2));
        bve.e(nb9.class, new ia7(4));
        bve.e(va9.class, new cl(27));
        bve.e(ebe.class, new ia7(5));
        bve.e(yp6.class, new ia7(6));
        bve.e(gtf.class, new ia7(7));
        bve.e(a.class, new ia7(8));
        bve.e(r10.class, new ia7(9));
        bve.e(wz.class, new ia7(10));
        bve.e(b00.class, new ia7(11));
        bve.e(q7f.class, new ia7(12));
        bve.e(st7.class, new ia7(13));
        bve.e(cbe.class, new ia7(15));
        bve.e(yy5.class, new ia7(16));
        bve.e(gl7.class, new ia7(17));
        bve.e(mce.class, new ia7(18));
        bve.e(wud.class, new ia7(19));
        bve.e(fbe.class, new ia7(20));
        bve.e(nae.class, new ia7(21));
        bve.e(x7.class, new ia7(22));
        bve.e(oib.class, new ia7(23));
        bve.e(mu4.class, new ia7(24));
        bve.e(xce.class, new ia7(26));
        bve.e(h30.class, new ia7(27));
        bve.e(b34.class, new ia7(28));
        bve.e(m19.class, new ia7(29));
        bve.e(bbe.class, new ja7(0));
        bve.e(f35.class, new ja7(1));
        bve.e(bv0.class, new ja7(2));
        bve.e(fd5.class, new ja7(3));
        bve.e(xoa.class, new ja7(4));
        bve.e(j86.class, new cl(28));
        Class<z24> cls = z24.class;
        bve.c(cls, new ef4(22));
        bve.e(na7.class, new ef4(23));
        bve.e(ua3.class, new ja7(5));
        bve.e(o4a.class, new ja7(7));
        bve.e(mib.class, new ja7(8));
        bve.e(x4a.class, new uz0(23));
        bve.e(mbe.class, new uz0(24));
        bve.e(pae.class, new uz0(25));
        bve.e(smc.class, new uz0(26));
        bve.e(xmc.class, new uz0(27));
        bve.e(vmc.class, new uz0(28));
        bve.e(b27.class, new uz0(29));
        bve.e(a27.class, new z93(0));
        bve.e(cs7.class, new z93(1));
        bve.e(lhd.class, new uz0(21));
        bve.e(n64.class, new uz0(22));
        bve.e(mm7.class, new ja7(14));
        bve.e(um7.class, new vrd(4));
        bve.e(tyd.class, new vrd(5));
        bve.e(lne.class, new vrd(6));
        bve.e(wz9.class, new uz9(1));
        bve.e(yz9.class, new lq9(14));
        bve.e(we5.class, new uz9(12));
        bve.e(q0a.class, new uz9(23));
        bve.e(Resources.class, new vz9(4));
        bve.e(a5.class, new vz9(8));
        bve.e(sa3.class, new vz9(9));
        bve.e(a4a.class, new vz9(10));
        bve.e(f34.class, new vz9(11));
        bve.e(y3a.class, new vz9(12));
        bve.e(v24.class, new ja7(21));
        bve.e(xz9.class, new ja7(22));
        bve.e(w6a.class, new ja7(23));
        bve.e(v6a.class, new ja7(24));
        bve.e(m86.class, new ho7(18));
        bve.e(yr4.class, new ho7(19));
        bve.e(zu5.class, new ho7(20));
        bve.e(iv5.class, new ho7(21));
        bve.e(g86.class, new ho7(22));
        bve.e(l1c.class, new ho7(23));
        bve.e(g5a.class, new ja7(25));
        bve.e(p7a.class, new ja7(26));
        bve.e(mg5.class, new ja7(27));
        bve.e(o6a.class, new ja7(28));
        bve.e(u98.class, new ja7(29));
        bve.e(xh0.class, new uz9(0));
        bve.e(zz9.class, new uz9(2));
        bve.e(o7a.class, new tz9(eg4.c, eg4.o));
        bve.e(h7a.class, new ho7(24));
        bve.e(o54.class, new ho7(25));
        bve.e(b4a.class, new ho7(10));
        bve.e(mb5.class, new uz9(3));
        bve.e(dd5.class, new uz9(4));
        bve.e(gyb.class, new uz9(5));
        bve.e(dm6.class, new uz9(6));
        bve.e(fce.class, new uz9(7));
        bve.e(tae.class, new uz9(8));
        bve.e(uu4.class, new uz9(9));
        bve.e(nu4.class, new uz9(10));
        bve.e(wv4.class, new uz9(11));
        bve.e(fu4.class, new uz9(13));
        bve.e(ji.class, new ho7(11));
        bve.e(vf4.class, new uz9(14));
        bve.e(RLottie.Config.class, new uz9(15));
        bve.e(WebmConfig.Config.class, new uz9(16));
        bve.e(eg9.class, new uz9(17));
        bve.e(yt4.class, new uz9(18));
        bve.e(fq6.class, new uz9(19));
        bve.e(vl.class, new uz9(20));
        bve.e(ka3.class, new uz9(21));
        bve.e(g15.class, new uz9(22));
        bve.e(ku3.class, new uz9(24));
        bve.e(i6a.class, new uz9(25));
        bve.e(loa.class, new uz9(26));
        bve.e(al.class, new lq9(15));
        bve.e(gg7.class, new ho7(12));
        bve.e(kk0.class, new uz9(27));
        Class<pf4> cls2 = pf4.class;
        bve.c(cls2, new lq9(5));
        bve.e(pv3.class, new uz9(28));
        bve.e(dd.class, new uz9(29));
        bve.e(op.class, new lq9(16));
        bve.e(pp.class, new lq9(17));
        bve.e(hba.class, new lq9(18));
        bve.e(ff7.class, new lq9(19));
        bve.c(cls, new lq9(6));
        bve.c(cls, new lq9(7));
        bve.c(cls, new lq9(8));
        bve.e(z5a.class, new ho7(13));
        bve.e(ydd.class, new vz9(0));
        Class<pp7> cls3 = pp7.class;
        bve.c(cls3, new lq9(9));
        bve.e(zm9.class, new vz9(1));
        bve.e(ue0.class, new vz9(2));
        bve.c(cls3, new lq9(10));
        bve.e(td3.class, new vz9(3));
        bve.e(ab7.class, new vz9(5));
        bve.c(cls3, new lq9(11));
        bve.c(cls2, new lq9(12));
        bve.e(f0a.class, new ho7(14));
        bve.e(v29.class, new ho7(15));
        bve.c(vw9.class, new lq9(13));
        bve.e(t72.class, new ho7(16));
        bve.e(h0a.class, new vz9(6));
        bve.e(t1a.class, new ho7(17));
        bve.c(cls2, new lq9(1));
        bve.e(i0a.class, new lq9(20));
        bve.c(cls2, new lq9(2));
        bve.e(dcc.class, new vz9(7));
        bve.c(cls3, new lq9(3));
        bve.c(cls2, new lq9(4));
        bve.e(zy9.class, new y4(0));
        bve.e(c5.class, new y4(1));
        bve.e(n70.class, new y4(2));
        xie.M(bve);
        r7e r7e = new r7e(new xd3(14));
        bve.e(kp.class, new vz9(27));
        bve.e(qpc.class, new vz9(28));
        bve.e(ip.class, new vz9(29));
        bve.e(yzc.class, new h2b(0));
        bve.e(vqc.class, new h2b(1));
        bve.e(xzc.class, new h2b(2));
        bve.e(kb5.class, new h2b(3));
        bve.e(sqc.class, new h2b(4));
        bve.e(jb5.class, new h2b(5));
        bve.e(i03.class, new c06(2, r7e));
        bve.e(lqc.class, new vz9(22));
        bve.e(f03.class, new vz9(23));
        bve.e(f70.class, new vz9(24));
        bve.e(j2b.class, new vz9(25));
        bve.e(g2b.class, new vz9(26));
        bve.c(cls, new g(0));
        bve.e(yy9.class, new y4(3));
        bve.e(m1a.class, new y4(4));
        bve.e(r2a.class, new y4(5));
        bve.d(d8a.class, new y4(6));
        bve.d(y6a.class, new y4(7));
        bve.d(ng0.class, new cl(0));
        bve.b(cls, new g(3));
        bve.b(cls, new g(2));
        bve.d(kp3.class, new cl(7));
        bve.d(wn3.class, new cl(8));
        bve.d(p54.class, new cl(9));
        bve.d(qf0.class, new cl(10));
        bve.d(eq9.class, new cl(11));
        bve.d(fg0.class, new y4(12));
        bve.d(dj1.class, new y4(23));
        bve.d(eq1.class, new y4(28));
        bve.d(ro1.class, new y4(29));
        bve.d(boc.class, new uz0(0));
        bve.d(fdc.class, new uz0(1));
        bve.d(cq1.class, new uz0(2));
        bve.d(xp1.class, new uz0(3));
        bve.d(nnc.class, new uz0(4));
        bve.d(km1.class, new uz0(5));
        bve.d(jq1.class, new y4(13));
        bve.d(kp1.class, new y4(14));
        bve.d(so1.class, new y4(15));
        bve.d(vx0.class, new y4(16));
        bve.d(aka.class, new y4(17));
        bve.d(vp1.class, new y4(18));
        bve.d(bt3.class, new y4(19));
        bve.d(dq4.class, new y4(20));
        bve.d(d11.class, new y4(21));
        bve.d(qz0.class, new y4(22));
        bve.d(qka.class, new y4(24));
        bve.d(wi4.class, new y4(25));
        bve.d(jp1.class, new y4(26));
        bve.d(n11.class, new y4(27));
        bve.b(cls, new g(16));
        bve.d(kx0.class, new uz0(9));
        bve.d(h91.class, new uz0(10));
        bve.d(w71.class, new uz0(11));
        bve.b(cls, new g(7));
        bve.d(g85.class, new uz0(6));
        bve.d(l81.class, new uz0(7));
        bve.d(a61.class, new uz0(8));
        bve.b(cls2, new g(8));
        bve.b(cls2, new g(9));
        bve.b(cls2, new g(10));
        bve.b(cls2, new g(11));
        bve.b(cls2, new g(12));
        bve.b(cls2, new g(13));
        bve.b(cls2, new g(14));
        bve.b(cls2, new g(15));
        bve.b(cls2, new g(4));
        bve.b(cls2, new g(5));
        bve.b(cls2, new g(6));
        bve.d(po1.class, new cl(12));
        bve.d(xk1.class, new cl(13));
        bve.b(cls, new g(17));
        bve.d(fr7.class, new uz0(12));
        bve.d(gw8.class, new cl(14));
        bve.d(dm4.class, new uz0(13));
        bve.d(l47.class, new cl(15));
        bve.d(ff5.class, new g(19));
        bve.b(cls2, new g(18));
        bve.b(cls, new g(20));
        bve.d(xy5.class, new g(22));
        bve.b(cls2, new g(21));
        bve.d(wa2.class, new uz0(14));
        bve.b(cls, new g(23));
        bve.b(cls, new g(24));
        bve.d(eq2.class, new uz0(15));
        bve.d(ma2.class, new uz0(16));
        bve.d(ho2.class, new uz0(17));
        bve.d(jte.class, new uz0(18));
        bve.d(mq2.class, new uz0(19));
        bve.d(c5a.class, new uz0(20));
        bve.d(bw2.class, new g(25));
        bve.d(src.class, new g(26));
        bve.d(yi8.class, new cl(16));
        bve.d(pk8.class, new cl(17));
        bve.d(dk8.class, new cl(18));
        bve.d(dl8.class, new cl(19));
        bve.d(ni8.class, new cl(20));
        bve.b(cls, new g(28));
        bve.d(ok3.class, new z93(2));
        bve.b(cls, new g(27));
        bve.d(p76.class, new cl(21));
        bve.d(y24.class, new z93(3));
        bve.d(d34.class, new z93(4));
        bve.b(cls, new ef4(3));
        bve.b(cls2, new ef4(4));
        bve.b(cls2, new ef4(5));
        bve.b(cls2, new ef4(6));
        bve.b(cls2, new ef4(7));
        bve.b(cls2, new ef4(8));
        bve.b(cls2, new ef4(9));
        bve.b(cls2, new ef4(10));
        bve.b(cls2, new ef4(11));
        bve.b(cls2, new g(29));
        bve.b(cls2, new ef4(0));
        bve.b(cls2, new ef4(1));
        bve.b(cls2, new ef4(2));
        bve.b(cls, new ef4(12));
        bve.d(er5.class, new cl(22));
        bve.b(cls, new ef4(13));
        bve.d(ny.class, new ef4(14));
        bve.d(lw5.class, new z93(5));
        bve.d(cv5.class, new z93(6));
        bve.d(g0b.class, new z93(7));
        bve.d(cn0.class, new z93(8));
        bve.d(hr6.class, new z93(9));
        bve.d(gr6.class, new z93(10));
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        bve.d(j06.class, new c06(0, atomicBoolean));
        bve.b(cls2, new b06(atomicBoolean));
        bve.d(ir6.class, new z93(11));
        bve.d(fr6.class, new z93(12));
        bve.d(nxa.class, new z93(13));
        bve.d(mxa.class, new z93(14));
        bve.d(yt6.class, new z93(18));
        bve.d(tt6.class, new ef4(17));
        bve.d(xt6.class, new z93(19));
        bve.b(cls, new ef4(16));
        bve.d(et0.class, new cl(26));
        bve.d(s5a.class, new z93(20));
        bve.d(q49.class, new ef4(18));
        bve.d(lr2.class, new ef4(19));
        bve.d(fw6.class, new z93(21));
        bve.d(en0.class, new c06(1, new gvf(25)));
        bve.d(qhb.class, new z93(22));
        bve.b(cls, new ef4(20));
        bve.d(u76.class, new ef4(21));
        bve.d(ef7.class, new ef4(24));
        bve.b(cls, new ef4(25));
        bve.d(pb5.class, new cl(29));
        bve.d(c70.class, new ho7(0));
        bve.b(cls, new ef4(26));
        bve.d(kfc.class, new ja7(15));
        bve.b(cls, new ef4(27));
        bve.d(wp2.class, new ja7(16));
        bve.d(qp0.class, new ja7(17));
        bve.d(qe8.class, new ho7(1));
        bve.d(h84.class, new ho7(2));
        bve.d(ml4.class, new ho7(3));
        bve.d(mgd.class, new ho7(4));
        bve.d(rod.class, new ja7(18));
        bve.d(i4a.class, new ja7(19));
        bve.b(cls, new ef4(28));
        bve.d(xi8.class, new ho7(5));
        bve.d(o94.class, new ho7(6));
        xs7.T(bve);
        bve.b(cls, new ef4(29));
        bve.b(cls, new lq9(0));
        gp0.J(bve);
        bve.d(vva.class, new ho7(26));
        gwf.T(bve);
        pa2.M(bve);
        iu7.d0(bve);
        ek8.d0(bve);
        n1g.b0(bve);
        hwf.x(bve);
        gt0.O(bve);
        ct0.O(bve);
        mt0.R(bve);
        bm3.K(bve);
        wx3.I(bve);
        ek8.e0(bve);
        hwf.y(bve);
        d8.H(bve);
        ct0.P(bve);
        z3d.P(bve);
        gt0.P(bve);
        mt0.S(bve);
        pa2.N(bve);
        n06.G(bve);
        js.I(bve);
        z3d.Q(bve);
        hwf.w(bve);
        a24.i0(bve);
        return jue.a;
    }

    /* JADX WARNING: type inference failed for: r8v18, types: [rr3, one.me.chats.picker.contacts.ContactsPickerScreen] */
    /* JADX WARNING: type inference failed for: r8v79, types: [rr3, one.me.folders.picker.FolderMemberPickerScreen] */
    /* JADX WARNING: type inference failed for: r8v83, types: [rr3, one.me.folders.list.FoldersListScreen] */
    /* JADX WARNING: type inference failed for: r8v113, types: [rr3, one.me.android.join.JoinChatWidget] */
    /* JADX WARNING: type inference failed for: r8v128, types: [rr3, one.me.android.deeplink.LinkInterceptorWidget] */
    /* JADX WARNING: type inference failed for: r8v146, types: [rr3, one.me.devmenu.logsviewer.LogsViewerScreen] */
    public final Object invoke(Object obj) {
        Object obj2;
        Object value;
        Object obj3;
        Object value2;
        List list;
        boolean z;
        String str = BuildConfig.FLAVOR;
        boolean z2 = false;
        String str2 = null;
        switch (this.a) {
            case 0:
                k77[] k77Arr = ChatsTabWidget.F0;
                ((ChatsTabWidget) this.b).o0().getClass();
                return Boolean.valueOf(!((sz9) obj).a.equals("all.chat.folder"));
            case 1:
                View view = (View) obj;
                k77[] k77Arr2 = ContactAvatarsScreen.D0;
                ((ContactAvatarsScreen) this.b).getRouter().C();
                return jue.a;
            case 2:
                ((dk3) ((cpf) this.b).Y).e(((Long) obj).longValue());
                return jue.a;
            case 3:
                View view2 = (View) obj;
                k77[] k77Arr3 = ContactsPickerScreen.z0;
                ex9 onBackPressedDispatcher = ((ContactsPickerScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.d();
                }
                return jue.a;
            case 4:
                pq3 pq3 = (pq3) obj;
                k77[] k77Arr4 = ContextMenuBottomSheet.K0;
                ContextMenuBottomSheet contextMenuBottomSheet = (ContextMenuBottomSheet) this.b;
                contextMenuBottomSheet.getClass();
                k77[] k77Arr5 = ContextMenuBottomSheet.K0;
                k77 k77 = k77Arr5[6];
                jr jrVar = contextMenuBottomSheet.I0;
                if (!((Boolean) jrVar.a(contextMenuBottomSheet)).booleanValue()) {
                    k77 k772 = k77Arr5[6];
                    jrVar.b(contextMenuBottomSheet, Boolean.TRUE);
                    tq3 targetController = contextMenuBottomSheet.getTargetController();
                    if (targetController instanceof tq3) {
                        str2 = targetController;
                    }
                    if (str2 != null) {
                        k77 k773 = k77Arr5[0];
                        str2.y(pq3.a, (Bundle) contextMenuBottomSheet.C0.a(contextMenuBottomSheet));
                    }
                }
                contextMenuBottomSheet.r0(true);
                return jue.a;
            case 5:
                return ((ParticipantStore) this.b).get((ParticipantId) obj);
            case 6:
                int intValue = ((Integer) obj).intValue();
                dqd m0 = ((sv3) ((cpf) this.b).Y).m0();
                m0.getClass();
                int i = kca.s;
                l05 l05 = m0.A0;
                if (intValue == i) {
                    mpd.c.getClass();
                    taf.o(l05, new a34(":start-conversation/chat"));
                } else if (intValue == kca.r) {
                    mpd.c.getClass();
                    taf.o(l05, new a34(":start-conversation/channel"));
                } else {
                    try {
                        obj2 = ((Context) m0.b.getValue()).getResources().getResourceName(intValue);
                    } catch (Throwable th) {
                        obj2 = new kcc(th);
                    }
                    Object h = wn6.h(intValue, "Unknown id #");
                    if (obj2 instanceof kcc) {
                        obj2 = h;
                    }
                    String str3 = (String) obj2;
                    udd.s("StartConversation", rf0.h("Unknown button was clicked: ", str3), new IllegalArgumentException(rf0.h("Unknown button was clicked in start conversation flow: ", str3)));
                }
                return jue.a;
            case 7:
                return a(obj);
            case 8:
                ((ih4) this.b).C((jsd) obj);
                return jue.a;
            case 9:
                String className = ((StackTraceElement) obj).getClassName();
                Package packageR = ((f25) this.b).getClass().getPackage();
                if (packageR != null) {
                    str2 = packageR.getName();
                }
                if (str2 != null) {
                    str = str2;
                }
                return Boolean.valueOf(!p0e.Q(className, str, false));
            case 10:
                View view3 = (View) obj;
                k77[] k77Arr6 = FaqWebViewWidget.Z;
                ((FaqWebViewWidget) this.b).getRouter().C();
                return jue.a;
            case 11:
                le5 le5 = (le5) this.b;
                xs7.E(le5.b, le5.k, (ru3) null, new he5(le5, (List) obj, (Continuation) null), 2);
                return jue.a;
            case 12:
                CharSequence charSequence = (CharSequence) obj;
                np5 np5 = ((xp5) this.b).K0;
                if (np5 != null) {
                    rq5 m02 = ((FolderEditScreen) np5).m0();
                    if (!hhd.f(charSequence, ((dq5) m02.y0.a.getValue()).a())) {
                        grd grd = m02.x0;
                        do {
                            value = grd.getValue();
                            dq5 dq5 = (dq5) value;
                            if (dq5 instanceof bq5) {
                                bq5 bq5 = (bq5) dq5;
                                boolean z3 = charSequence.length() == 0;
                                bq5.getClass();
                                obj3 = new bq5(charSequence, !z3);
                            } else if (dq5 instanceof cq5) {
                                cq5 cq5 = (cq5) dq5;
                                if (charSequence.length() != 0) {
                                    ep5 ep5 = m02.E0;
                                    if (!p0e.J(charSequence, ep5 != null ? ep5.b : null)) {
                                        z = true;
                                        obj3 = cq5.b(cq5, charSequence, z, 2);
                                    }
                                }
                                z = false;
                                obj3 = cq5.b(cq5, charSequence, z, 2);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } while (!grd.b(value, obj3));
                        grd grd2 = m02.z0;
                        do {
                            value2 = grd2.getValue();
                            list = (List) value2;
                            Object V = o23.V(list);
                            wp5 wp5 = V instanceof wp5 ? (wp5) V : null;
                            if (wp5 != null) {
                                ArrayList arrayList = new ArrayList(list);
                                arrayList.set(0, new wp5(new lge(charSequence), wp5.b, wp5.c));
                                list = arrayList;
                            }
                        } while (!grd2.b(value2, list));
                    }
                }
                return jue.a;
            case 13:
                View view4 = (View) obj;
                k77[] k77Arr7 = FolderMemberPickerScreen.C0;
                ex9 onBackPressedDispatcher2 = ((FolderMemberPickerScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher2 != null) {
                    onBackPressedDispatcher2.d();
                }
                return jue.a;
            case 14:
                View view5 = (View) obj;
                k77[] k77Arr8 = FoldersListScreen.Z;
                ex9 onBackPressedDispatcher3 = ((FoldersListScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher3 != null) {
                    onBackPressedDispatcher3.d();
                }
                return jue.a;
            case 15:
                ep5 ep52 = (ep5) obj;
                if (!hhd.f(ep52.a, "all.chat.folder")) {
                    if (ep52.z0.contains(Long.valueOf(((ft5) this.b).b))) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            case 16:
                fj0 fj0 = (fj0) obj;
                String str4 = ((FrgContactAvatarsLoader) this.b).G1.o;
                if (!r1g.p(str4)) {
                    return vx3.t(str4, fj0, ej0.b);
                }
                return null;
            case 17:
                Void voidR = (Void) obj;
                eb6 eb6 = (eb6) this.b;
                udd.p(eb6.e, "startRetriever: success", new Object[0]);
                eb6.h = null;
                return jue.a;
            case 18:
                rg6 rg6 = (rg6) obj;
                zt3 zt3 = ((jh6) this.b).h;
                if (!(zt3 instanceof Collection) || !zt3.isEmpty()) {
                    wt3 it = zt3.iterator();
                    while (true) {
                        wt3 wt3 = it;
                        if (wt3.hasNext()) {
                            rg6 rg62 = (rg6) wt3.next();
                            if (!(rg62 instanceof qg6) && rg62.getId() == rg6.getId()) {
                                z2 = true;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z2);
            case 19:
                View view6 = (View) obj;
                k77[] k77Arr9 = InviteByPhoneScreen.F0;
                y7a n0 = ((InviteByPhoneScreen) this.b).n0();
                EditText editText = n0.A0;
                editText.clearFocus();
                try {
                    ((InputMethodManager) n0.getContext().getSystemService("input_method")).hideSoftInputFromWindow(editText.getWindowToken(), 0);
                } catch (Throwable unused) {
                }
                z07.c.P1().d();
                return jue.a;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE /*20*/:
                ww9 ww9 = (ww9) obj;
                k77[] k77Arr10 = JoinChatWidget.B0;
                ? r8 = (JoinChatWidget) this.b;
                if (r8.getActivity() instanceof efc) {
                    r8.getRouter().C();
                } else {
                    Activity activity = r8.getActivity();
                    if (activity != null) {
                        activity.finish();
                    }
                }
                return jue.a;
            case 21:
                int intValue2 = ((Integer) obj).intValue();
                k77[] k77Arr11 = KeyboardEmojiWidget.w0;
                KeyboardEmojiWidget keyboardEmojiWidget = (KeyboardEmojiWidget) this.b;
                keyboardEmojiWidget.l0().E0();
                uv4 uv4 = (uv4) keyboardEmojiWidget.a.getValue();
                uv4.getClass();
                uv4.r(intValue2, new q8(intValue2, 3, uv4));
                return jue.a;
            case 22:
                long longValue = ((Long) obj).longValue();
                k77[] k77Arr12 = KeyboardStickersWidget.x0;
                KeyboardStickersWidget keyboardStickersWidget = (KeyboardStickersWidget) this.b;
                keyboardStickersWidget.l0().E0();
                lyd n02 = keyboardStickersWidget.n0();
                n02.getClass();
                n02.t(longValue, new yo3(n02, longValue, 2));
                return jue.a;
            case 23:
                ww9 ww92 = (ww9) obj;
                int i2 = LinkInterceptorWidget.o;
                ? r82 = (LinkInterceptorWidget) this.b;
                if (r82.getActivity() instanceof efc) {
                    r82.getRouter().C();
                } else {
                    Activity activity2 = r82.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                return jue.a;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                boolean z4 = obj instanceof nf7;
                rf7 rf7 = (rf7) this.b;
                if (z4) {
                    ((nf7) obj).a = rf7.a;
                } else {
                    rf7.d(obj);
                }
                return jue.a;
            case 25:
                return ((wk7) this.b).c.c(((o46) obj).a);
            case 26:
                try {
                    return (CharSequence) ((j26) this.b).apply(obj);
                } catch (Throwable unused2) {
                    return str;
                }
            case 27:
                View view7 = (View) obj;
                k77[] k77Arr13 = LogsViewerScreen.Y;
                ex9 onBackPressedDispatcher4 = ((LogsViewerScreen) this.b).getOnBackPressedDispatcher();
                if (onBackPressedDispatcher4 != null) {
                    onBackPressedDispatcher4.d();
                }
                return jue.a;
            case 28:
                return Boolean.valueOf(!((tu7) this.b).c.contains(Integer.valueOf(((MenuItem) obj).getItemId())));
            default:
                ww9 ww93 = (ww9) obj;
                k77[] k77Arr14 = MediaKeyboardWidget.G0;
                ((u68) ((MediaKeyboardWidget) this.b).c.getValue()).Y.m((Object) null, new pg9());
                return jue.a;
        }
    }
}
