package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import java.util.Collection;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.Continuation;
import one.me.android.OneMeApplication;
import one.me.chats.picker.PickerChatsTabWidget;
import one.me.chats.picker.chats.PickerChatsTabWidget2;
import one.me.chats.picker.contacts.PickerContactsListWidget;
import one.me.notifications.settings.NotificationsSettingsScreen;
import one.me.notifications.settings.screens.other.OtherNotificationsSettingsScreen;
import one.me.profile.ProfileScreen;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.nano.Protos;

/* renamed from: qq9  reason: default package */
public final /* synthetic */ class qq9 implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ qq9() {
        this.a = 8;
        mfc mfc = mfc.a;
    }

    public final Object invoke(Object obj) {
        s59 s59 = km4.y0;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                k77[] k77Arr = NotificationsSettingsScreen.z0;
                lp9.c.P1().d();
                return jue;
            case 1:
                Throwable th = (Throwable) obj;
                int i = OneMeApplication.w0;
                return Boolean.FALSE;
            case 2:
                gy7 gy7 = (gy7) obj;
                int i2 = OneMeApplication.w0;
                return "    " + gy7.a + ": executing=" + gy7.o.toMillis(gy7.c) + "ms";
            case 3:
                gy7 gy72 = (gy7) obj;
                int i3 = OneMeApplication.w0;
                return "    " + gy72.a + ": waiting=" + gy72.o.toMillis(gy72.b) + "ms";
            case 4:
                gy7 gy73 = (gy7) obj;
                int i4 = OneMeApplication.w0;
                TimeUnit timeUnit = gy73.o;
                return "    " + gy73.a + ": executing=" + timeUnit.toMillis(gy73.c) + "ms, waiting=" + timeUnit.toMillis(gy73.b);
            case 5:
                int intValue = ((Integer) obj).intValue();
                return Integer.valueOf(intValue != 0 ? intValue != 1 ? 10 : 15 : 18);
            case 6:
                Long l = (Long) obj;
                return uc9.a();
            case 7:
                View view2 = (View) obj;
                ViewGroup viewGroup = view2 instanceof ViewGroup ? (ViewGroup) view2 : null;
                if (viewGroup != null) {
                    if (viewGroup.getChildCount() == 0) {
                        viewGroup = null;
                    }
                    if (viewGroup != null) {
                        return new es(8, viewGroup);
                    }
                }
                return null;
            case 8:
                View view3 = (View) obj;
                if (view3 instanceof ViewGroup) {
                    ((ViewGroup) view3).setOnHierarchyChangeListener(mfc.a);
                }
                return Boolean.TRUE;
            case 9:
                Collection collection = (Collection) obj;
                k77[] k77Arr2 = x4a.p;
                return jue;
            case 10:
                ((pda) obj).getText();
                return -16745729;
            case 11:
                return Integer.valueOf(26 - ((((Integer) obj).intValue() + 1) * 4));
            case Protos.Attaches.Attach.PRESENT /*12*/:
                ((pda) obj).getText();
                return -16745729;
            case 13:
                return ((ii3) obj).a();
            case Protos.Attaches.Attach.LOCATION /*14*/:
                View view4 = (View) obj;
                k77[] k77Arr3 = OtherNotificationsSettingsScreen.Y;
                lp9.c.P1().d();
                return jue;
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return ((pi2) obj).G0;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                sz9 sz9 = (sz9) obj;
                k77[] k77Arr4 = PickerChatsTabWidget.z0;
                return Boolean.FALSE;
            case LangUtils.HASH_SEED:
                sz9 sz92 = (sz9) obj;
                k77[] k77Arr5 = PickerChatsTabWidget2.C0;
                return Boolean.FALSE;
            case 18:
                ((Integer) obj).getClass();
                k77[] k77Arr6 = PickerContactsListWidget.C0;
                return Boolean.FALSE;
            case 19:
                Long l2 = (Long) obj;
                return hrd.a((Object) null);
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                View view5 = (View) obj;
                k77[] k77Arr7 = ProfileInviteScreen.Y;
                kdb.c.f2();
                return jue;
            case 21:
                return Integer.valueOf(((pda) obj).getText().f);
            case 22:
                Toolbar toolbar = (Toolbar) obj;
                k77[] k77Arr8 = ProfileScreen.H0;
                nea nea = new nea(toolbar.getContext(), 6);
                nea.setId(j8a.j1);
                nea.setForm(fea.a);
                nea.setTextShimmerEnabled(false);
                nea.setLeftActions(new vda(new qq9(25)));
                float f = (float) 6;
                nea.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f), nea.getPaddingTop(), a24.X(f * dh4.c().getDisplayMetrics().density), nea.getPaddingBottom());
                toolbar.addView(nea);
                return jue;
            case 23:
                LinearLayout linearLayout = (LinearLayout) obj;
                k77[] k77Arr9 = ProfileScreen.H0;
                mz9 mz9 = new mz9(linearLayout.getContext());
                mz9.setId(j8a.d1);
                float f2 = (float) 96;
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a24.X(dh4.c().getDisplayMetrics().density * f2), a24.X(f2 * dh4.c().getDisplayMetrics().density));
                layoutParams.gravity = 1;
                layoutParams.topMargin = a24.X(((float) 8) * dh4.c().getDisplayMetrics().density);
                mz9.setLayoutParams(layoutParams);
                linearLayout.addView(mz9);
                TextView textView = new TextView(linearLayout.getContext());
                textView.setId(j8a.h1);
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                float f3 = (float) 20;
                layoutParams2.leftMargin = a24.X(dh4.c().getDisplayMetrics().density * f3);
                layoutParams2.rightMargin = a24.X(f3 * dh4.c().getDisplayMetrics().density);
                layoutParams2.topMargin = a24.X(((float) 16) * dh4.c().getDisplayMetrics().density);
                layoutParams2.gravity = 1;
                textView.setLayoutParams(layoutParams2);
                textView.setMaxLines(3);
                textView.setGravity(1);
                nte.x.b(textView, yq4.b);
                textView.setTextColor(s59.r(textView).getText().e);
                linearLayout.addView(textView);
                qq9 qq9 = new qq9(24);
                LinearLayout linearLayout2 = new LinearLayout(linearLayout.getContext());
                linearLayout2.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                float f4 = (float) 12;
                linearLayout2.setPaddingRelative(a24.X(dh4.c().getDisplayMetrics().density * f4), a24.X(((float) 4) * dh4.c().getDisplayMetrics().density), a24.X(f4 * dh4.c().getDisplayMetrics().density), linearLayout2.getPaddingBottom());
                linearLayout2.setOrientation(0);
                linearLayout2.setBackground((Drawable) null);
                linearLayout2.setGravity(1);
                qq9.invoke(linearLayout2);
                linearLayout.addView(linearLayout2);
                return jue;
            case 24:
                LinearLayout linearLayout3 = (LinearLayout) obj;
                k77[] k77Arr10 = ProfileScreen.H0;
                AppCompatTextView appCompatTextView = new AppCompatTextView(linearLayout3.getContext(), (AttributeSet) null);
                appCompatTextView.setId(j8a.U);
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                float f5 = (float) 20;
                layoutParams3.leftMargin = a24.X(dh4.c().getDisplayMetrics().density * f5);
                appCompatTextView.setLayoutParams(layoutParams3);
                appCompatTextView.setGravity(1);
                nge nge = nte.m;
                nge.b(appCompatTextView, yq4.b);
                urd.B(new f85(3, (Continuation) null, 5), appCompatTextView);
                appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
                appCompatTextView.setMaxLines(1);
                linearLayout3.addView(appCompatTextView);
                AppCompatTextView appCompatTextView2 = new AppCompatTextView(linearLayout3.getContext(), (AttributeSet) null);
                appCompatTextView2.setId(j8a.E);
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                float f6 = (float) 4;
                layoutParams4.setMarginStart(a24.X(dh4.c().getDisplayMetrics().density * f6));
                layoutParams4.setMarginEnd(a24.X(f6 * dh4.c().getDisplayMetrics().density));
                appCompatTextView2.setLayoutParams(layoutParams4);
                appCompatTextView2.setText("·");
                appCompatTextView2.setGravity(1);
                nge.b(appCompatTextView2, yq4.b);
                urd.B(new f85(3, (Continuation) null, 4), appCompatTextView2);
                linearLayout3.addView(appCompatTextView2);
                TextView textView2 = new TextView(linearLayout3.getContext());
                textView2.setId(j8a.g1);
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.rightMargin = a24.X(f5 * dh4.c().getDisplayMetrics().density);
                textView2.setLayoutParams(layoutParams5);
                textView2.setGravity(1);
                nte.o.b(textView2, yq4.b);
                textView2.setTextColor(s59.r(textView2).getText().f);
                linearLayout3.addView(textView2);
                return jue;
            case 25:
                View view6 = (View) obj;
                k77[] k77Arr11 = ProfileScreen.H0;
                kdb.c.f2();
                return jue;
            case 26:
                k77[] k77Arr12 = ProfileScreen.H0;
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
            case 27:
                k77[] k77Arr13 = ProfileScreen.H0;
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
            case 28:
                return new xyb((Context) obj);
            default:
                return String.valueOf(obj);
        }
    }

    public /* synthetic */ qq9(int i) {
        this.a = i;
    }

    public /* synthetic */ qq9(ProfileScreen profileScreen, int i) {
        this.a = i;
    }
}
