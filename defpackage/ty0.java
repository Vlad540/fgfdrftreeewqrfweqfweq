package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.folders.picker.FolderMemberPickerScreen;
import one.me.profile.ProfileScreen;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* renamed from: ty0  reason: default package */
public final class ty0 implements u16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ty0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [rr3, one.me.calls.ui.ui.settings.CallAdminSettingsScreen] */
    public final Object invoke(Object obj) {
        jue jue = jue.a;
        Object obj2 = this.b;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                ((CallAdminSettingsScreen) obj2).getRouter().C();
                return jue;
            case 1:
                ConstraintLayout constraintLayout = (ConstraintLayout) obj;
                k77[] k77Arr = ChatTitleIconScreen.D0;
                ChatTitleIconScreen chatTitleIconScreen = (ChatTitleIconScreen) obj2;
                chatTitleIconScreen.getClass();
                k77[] k77Arr2 = ChatTitleIconScreen.D0;
                k77 k77 = k77Arr2[3];
                nl0 nl0 = chatTitleIconScreen.y0;
                constraintLayout.addView((TextView) nl0.getValue());
                constraintLayout.addView(ChatTitleIconScreen.m0(chatTitleIconScreen));
                constraintLayout.addView(chatTitleIconScreen.n0());
                if (chatTitleIconScreen.p0() == kpd.o) {
                    constraintLayout.addView(ChatTitleIconScreen.l0(chatTitleIconScreen));
                }
                constraintLayout.addView(chatTitleIconScreen.o0());
                bf3 p = a06.p(constraintLayout);
                k77 k772 = k77Arr2[3];
                int id = ((TextView) nl0.getValue()).getId();
                k77 k773 = k77Arr2[2];
                p.d(id, 3, ((nea) chatTitleIconScreen.x0.getValue()).getId(), 4);
                hr1.q((float) 16, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id, 4));
                p.d(id, 6, 0, 6);
                p.d(id, 7, 0, 7);
                int id2 = ChatTitleIconScreen.m0(chatTitleIconScreen).getId();
                k77 k774 = k77Arr2[3];
                p.d(id2, 3, ((TextView) nl0.getValue()).getId(), 4);
                float f = (float) 24;
                hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id2, 4));
                p.d(id2, 6, 0, 6);
                p.d(id2, 7, 0, 7);
                int id3 = chatTitleIconScreen.n0().getId();
                p.d(id3, 3, ChatTitleIconScreen.m0(chatTitleIconScreen).getId(), 4);
                hr1.q(f, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id3, 4));
                p.d(id3, 6, 0, 6);
                p.d(id3, 7, 0, 7);
                int id4 = ChatTitleIconScreen.l0(chatTitleIconScreen).getId();
                p.d(id4, 3, chatTitleIconScreen.n0().getId(), 4);
                float f2 = (float) 8;
                hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id4, 4));
                p.d(id4, 6, 0, 6);
                p.d(id4, 7, 0, 7);
                xe4 l0 = ChatTitleIconScreen.l0(chatTitleIconScreen).getVisibility() == 0 ? ChatTitleIconScreen.l0(chatTitleIconScreen) : chatTitleIconScreen.n0();
                int id5 = chatTitleIconScreen.o0().getId();
                p.d(id5, 3, l0.getId(), 4);
                hr1.q(f2, dh4.c().getDisplayMetrics().density, new hw9(p, 3, id5, 4));
                p.d(id5, 6, 0, 6);
                p.d(id5, 7, 0, 7);
                p.d(id5, 4, 0, 4);
                p.g(id5).d.x = 1.0f;
                p.a(constraintLayout);
                return jue;
            case 2:
                lk3 lk3 = (lk3) obj;
                ((fu2) obj2).T0.f(lk3.a, lk3.A0);
                return jue;
            case 3:
                Long l = (Long) obj;
                return hrd.a((i22) obj2);
            case 4:
                View view2 = (View) obj;
                k77[] k77Arr3 = FolderMemberPickerScreen.C0;
                FolderMemberPickerScreen folderMemberPickerScreen = (FolderMemberPickerScreen) obj2;
                wq5 wq5 = (wq5) folderMemberPickerScreen.u0().c;
                k77 k775 = FolderMemberPickerScreen.C0[0];
                String str = (String) folderMemberPickerScreen.A0.a(folderMemberPickerScreen);
                if (!wq5.g) {
                    wq5.g = true;
                    ou3 ou3 = wq5.f;
                    if (ou3 != null) {
                        xs7.D(ou3, sk9.a.plus(((pae) wq5.c.getValue()).b()), ru3.c, new vq5(wq5, str, (Continuation) null));
                    }
                }
                return jue;
            case 5:
                if (((Boolean) obj).booleanValue()) {
                    y7a y7a = (y7a) obj2;
                    EditText editText = y7a.A0;
                    editText.requestFocus();
                    editText.post(new hg9(y7a, 4, editText));
                    y7a.setOnWindowFocusChanged((u16) null);
                }
                return jue;
            case 6:
                Throwable th = (Throwable) obj;
                try {
                    ((y0c) obj2).d();
                } catch (Throwable unused) {
                }
                return jue;
            case 7:
                Throwable th2 = (Throwable) obj;
                ((xra) obj2).q().h = null;
                return jue;
            case 8:
                Throwable th3 = (Throwable) obj;
                k77[] k77Arr4 = ksa.K0;
                ((ksa) obj2).r().h = null;
                return jue;
            case 9:
                Throwable th4 = (Throwable) obj;
                ((yv1) obj2).resumeWith(jue);
                return jue;
            case 10:
                View view3 = (View) obj;
                k77[] k77Arr5 = ProfileScreen.H0;
                fgb q0 = ((ProfileScreen) obj2).q0();
                t81 e = q0.T0.e();
                if (e != null) {
                    taf.o(q0.F0, e);
                }
                return jue;
            default:
                Throwable th5 = (Throwable) obj;
                ((xi4) obj2).f();
                return jue;
        }
    }
}
