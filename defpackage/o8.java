package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.Collections;
import one.me.calllist.ui.callinfo.CallLinkInfoScreen;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.profile.screens.addadmins.AddChatAdminsScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.messages.media.attaches.AudioAttachView;
import ru.ok.tamtam.nano.Protos;

/* renamed from: o8  reason: default package */
public final /* synthetic */ class o8 implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ o8(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        Activity d;
        boolean z = true;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
                if (viewGroup == null) {
                    return null;
                }
                if (viewGroup.getChildCount() <= 0) {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    return new es(8, viewGroup);
                }
                return null;
            case 1:
                return ((b7c) obj).a;
            case 2:
                return (Activity) ((WeakReference) obj).get();
            case 3:
                Activity activity = (Activity) obj;
                if (!activity.isDestroyed() && !activity.isFinishing()) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                return ((Activity) obj).getWindow().getDecorView().getRootView();
            case 5:
                ((Long) obj).getClass();
                k77[] k77Arr = AddChatAdminsScreen.B0;
                return hw4.a;
            case 6:
                return ((fa) obj).b.toString();
            case 7:
                tf3 tf3 = (tf3) obj;
                if (!tf3.Y && !tf3.w() && tf3.k() == 0 && (!tf3.t() || !tf3.v())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 8:
                return ((fa) obj).b.toString();
            case 9:
                Long l = (Long) obj;
                return hrd.a((Object) null);
            case 10:
                return ((nj) obj).f;
            case 11:
                return Boolean.valueOf(((rg6) obj) instanceof qg6);
            case Protos.Attaches.Attach.PRESENT /*12*/:
                return Boolean.valueOf(((rg6) obj) instanceof qg6);
            case 13:
                int i = AudioAttachView.A0;
                return Boolean.valueOf(((View) obj).isClickable());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Boolean.TRUE;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                pda pda = (pda) obj;
                k77[] k77Arr2 = CallAdminSettingsScreen.x0;
                return -14342611;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK /*16*/:
                ((pda) obj).getIcon();
                return -1;
            case LangUtils.HASH_SEED /*17*/:
                ((pda) obj).b();
                return 0;
            case 18:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case 19:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS /*20*/:
                Intent intent = (Intent) obj;
                intent.setAction("action-open-call");
                intent.setFlags(268435456);
                return jue;
            case 21:
                k77[] k77Arr3 = CallLinkInfoScreen.F0;
                ((pda) obj).getIcon();
                return -1;
            case 22:
                k77[] k77Arr4 = CallLinkInfoScreen.F0;
                ((pda) obj).b();
                return 0;
            case 23:
                Toolbar toolbar = (Toolbar) obj;
                k77[] k77Arr5 = CallLinkInfoScreen.F0;
                nea nea = new nea(toolbar.getContext(), 6);
                nea.setId(i1a.t);
                nea.setForm(fea.a);
                nea.setTextShimmerEnabled(false);
                nea.setLeftActions(new vda(new o8(25)));
                float f = (float) 6;
                nea.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), nea.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), nea.getPaddingBottom());
                toolbar.addView(nea);
                return jue;
            case 24:
                LinearLayout linearLayout = (LinearLayout) obj;
                k77[] k77Arr6 = CallLinkInfoScreen.F0;
                mz9 mz9 = new mz9(linearLayout.getContext());
                mz9.setId(i1a.r);
                mz9.setAvatarShape(fz9.a);
                float f2 = (float) 72;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = a24.X(((float) 32) * dh4.c().getDisplayMetrics().density);
                mz9.setLayoutParams(layoutParams);
                linearLayout.addView(mz9);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(i1a.u);
                nte.c.b(textView, yq4.b);
                s59 s59 = km4.y0;
                textView.setTextColor(s59.r(textView).getText().e);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setGravity(17);
                float f3 = (float) 12;
                textView.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density));
                textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.addView(textView);
                TextView textView2 = new TextView(linearLayout.getContext());
                textView2.setId(i1a.s);
                nte.j.b(textView2, yq4.b);
                s59.r(textView2);
                textView2.setTextColor(-16745729);
                textView2.setGravity(17);
                textView2.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), 0, a24.X(dh4.c().getDisplayMetrics().density * f3), a24.X(((float) 16) * dh4.c().getDisplayMetrics().density));
                textView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                fja.d(textView2);
                linearLayout.addView(textView2);
                TextView textView3 = new TextView(linearLayout.getContext());
                textView3.setId(i1a.q);
                nte.o.b(textView3, yq4.b);
                textView3.setTextColor(s59.r(textView3).getText().h);
                textView3.setGravity(17);
                textView3.setPadding(a24.X(dh4.c().getDisplayMetrics().density * f3), 0, a24.X(f3 * dh4.c().getDisplayMetrics().density), a24.X(((float) 0) * dh4.c().getDisplayMetrics().density));
                textView3.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                linearLayout.addView(textView3);
                return jue;
            case 25:
                View view2 = (View) obj;
                k77[] k77Arr7 = CallLinkInfoScreen.F0;
                j61 j61 = j61.c;
                if (!j61.P1().d() && (d = j61.P1().a().f().C().d()) != null) {
                    d.finish();
                }
                return jue;
            case 26:
                k77[] k77Arr8 = CallLinkInfoScreen.F0;
                ((pda) obj).getIcon();
                return -16745729;
            case 27:
                k77[] k77Arr9 = CallLinkInfoScreen.F0;
                ((pda) obj).b().a.getClass();
                return Integer.valueOf(j33.h(-16745729, 50));
            default:
                return obj instanceof Iterable ? (Iterable) obj : Collections.singletonList(obj);
        }
    }

    public /* synthetic */ o8(CallLinkInfoScreen callLinkInfoScreen, int i) {
        this.a = i;
    }
}
