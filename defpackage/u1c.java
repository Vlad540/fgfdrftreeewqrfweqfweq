package defpackage;

import android.content.Context;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Collections;
import one.me.android.OneMeApplication;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.settings.SettingsListScreen;
import one.me.stickersshowcase.StickersShowcaseScreen;
import one.me.webapp.rootscreen.WebAppRootScreen;
import ru.ok.messages.settings.ActSettings;
import ru.ok.tamtam.errors.TamErrorException;

/* renamed from: u1c  reason: default package */
public final /* synthetic */ class u1c implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ u1c(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        jue jue = jue.a;
        boolean z = false;
        switch (this.a) {
            case 0:
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
            case 1:
                return r1g.l(((TamErrorException) obj).a);
            case 2:
                ((y52) obj).h = null;
                return jue;
            case 3:
                return Integer.valueOf(((pda) obj).getText().f);
            case 4:
                return Integer.valueOf(((pda) obj).b().f);
            case 5:
                View view = new View((Context) obj);
                view.setId(a7a.J);
                view.setWillNotDraw(false);
                return view;
            case 6:
                return new a1f(0, ((pda) obj).a().a(true).b.g);
            case 7:
                Context context = (Context) obj;
                int i = yqb.setting_media_caching;
                int i2 = ActSettings.Z0;
                Intent intent = new Intent(context, ActSettings.class);
                intent.putExtra("ru.ok.tamtam.extra.SETTING_ID", i);
                intent.putExtra("ru.ok.tamtam.extra.SHOW_PUSH_ALERT", false);
                context.startActivity(intent);
                return jue;
            case 8:
                View view2 = (View) obj;
                k77[] k77Arr = SettingsListScreen.D0;
                w7d.c.P1().b(":invite/qr", (Bundle) null);
                return jue;
            case 9:
                return Boolean.valueOf(((tf3) obj).w());
            case 10:
                View view3 = (View) obj;
                k77[] k77Arr2 = StickersShowcaseScreen.z0;
                ixd.c.P1().b(":stickers/settings", (Bundle) null);
                return jue;
            case 11:
                osd osd = (osd) obj;
                k77[] k77Arr3 = lyd.F0;
                return Boolean.TRUE;
            case 12:
                ijd ijd = (ijd) obj;
                xy2 a2 = m7c.a(x97.class);
                ijd.getClass();
                String canonicalName = a2.a().getCanonicalName();
                ArrayList arrayList = ijd.a;
                if (canonicalName != null) {
                    arrayList.add(Collections.singletonList(canonicalName));
                }
                arrayList.add(Collections.singletonList("leakcanary.internal.LeakCanaryFileProvider"));
                ijd.a(m7c.a(am7.class), m7c.a(d8.class));
                ijd.a(m7c.a(OneMeApplication.class), m7c.a(Typeface.class));
                return jue;
            case 13:
                ijd ijd2 = (ijd) obj;
                xy2 a3 = m7c.a(jj7.class);
                ijd2.getClass();
                String canonicalName2 = a3.a().getCanonicalName();
                if (canonicalName2 != null) {
                    ijd2.a.add(Collections.singletonList(canonicalName2));
                }
                return jue;
            case 14:
                CharSequence charSequence = ((e2e) obj).e;
                if (charSequence == null || charSequence.length() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 15:
                return ((prc) obj).X;
            case 16:
                return ((km3) obj).a();
            case 17:
                CharSequence charSequence2 = ((e2e) obj).e;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z = true;
                }
                return Boolean.valueOf(!z);
            case 18:
                ((pda) obj).getText();
                return -16745729;
            case 19:
                yde yde = (yde) obj;
                return "t=" + yde.a + ", c=" + yde.b;
            case SavedMessagesIconDrawable.SMALL_ICON_SIZE:
                return Integer.valueOf(((pda) obj).getText().d);
            case 21:
                Thread.State state = (Thread.State) obj;
                return Long.valueOf(System.nanoTime());
            case 22:
                return Long.valueOf(((vo8) obj).k());
            case 23:
                return Long.valueOf(((vo8) obj).b);
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                return ((vo8) obj).z0;
            case 25:
                return Long.valueOf(((ym8) obj).a);
            case 26:
                return ((bh2) obj).a.toString();
            case 27:
                f9f f9f = new f9f((Context) obj);
                f9f.setVisibility(8);
                f9f.setAlpha(0.0f);
                return f9f;
            case 28:
                return String.valueOf(((y8f) obj).b);
            default:
                k77[] k77Arr4 = WebAppRootScreen.K0;
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
        }
    }
}
