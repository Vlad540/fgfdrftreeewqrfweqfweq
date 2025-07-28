package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import one.me.devmenu.DevMenuScreen;
import one.me.login.inputname.InputNameScreen;
import one.me.notifications.settings.screens.dialog.DialogNotificationsSettingsScreen;
import one.me.sdk.concurrent.watchdog.ThreadExecutorStuckException;
import one.me.sdk.uikit.common.button.OneMeButton;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.util.LangUtils;
import org.webrtc.PeerConnectionFactory;
import ru.ok.tamtam.errors.TamErrorException;
import ru.ok.tamtam.nano.Protos;

/* renamed from: t13  reason: default package */
public final /* synthetic */ class t13 implements u16 {
    public final /* synthetic */ int a;

    public /* synthetic */ t13(int i) {
        this.a = i;
    }

    public final Object invoke(Object obj) {
        v0a v0a = v0a.c;
        s0a s0a = s0a.o;
        u0a u0a = u0a.a;
        boolean z = false;
        jue jue = jue.a;
        switch (this.a) {
            case 0:
                String str = (String) obj;
                k77[] k77Arr = v13.k;
                return jue;
            case 1:
                udd.s("OneMeExecutors", "hanged threads", new ThreadExecutorStuckException((Collection) obj));
                return jue;
            case 2:
                udd.s("OneMeExecutors", "stucked threads", new ThreadExecutorStuckException((Collection) obj));
                return jue;
            case 3:
                return r1g.l(((TamErrorException) obj).a);
            case 4:
                wia wia = (wia) obj;
                return new bg3(((Long) wia.a).longValue(), Collections.singletonList((String) wia.b));
            case 5:
                ((pda) obj).getIcon();
                return new a1f(-1, -16745729);
            case 6:
                if (((uf3) obj) == uf3.o) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 7:
                if (((uf3) obj) == uf3.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 8:
                un3 un3 = (un3) obj;
                if (un3.b || un3.a == 7) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 9:
                return Boolean.valueOf(((un3) obj).b);
            case 10:
                ((Boolean) obj).getClass();
                return jue;
            case 11:
                ju3 ju3 = (fu3) obj;
                if (ju3 instanceof ju3) {
                    return ju3;
                }
                return null;
            case Protos.Attaches.Attach.PRESENT:
                View view = (View) obj;
                int i = DevMenuScreen.x0;
                hf4.c.P1().d();
                return jue;
            case 13:
                View view2 = (View) obj;
                k77[] k77Arr2 = DialogNotificationsSettingsScreen.Y;
                lp9.c.P1().d();
                return jue;
            case Protos.Attaches.Attach.LOCATION:
                if (((fp8) obj).c == ep8.Y) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case Protos.Attaches.Attach.DAILY_MEDIA:
                Map map = ((fp8) obj).f;
                Object obj2 = map != null ? map.get("url") : null;
                if (obj2 instanceof String) {
                    return (String) obj2;
                }
                return null;
            case PeerConnectionFactory.Options.ADAPTER_TYPE_LOOPBACK:
                return obj;
            case LangUtils.HASH_SEED:
                mt0.O(wn6.h(f25.z0.getAndIncrement(), "service-watchdog-"), new b25((Runnable) obj, 0));
                return jue;
            case 18:
                if (((cb5) obj).f != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                Long l = (Long) obj;
                l.longValue();
                return l;
            case ConnManagerParams.DEFAULT_MAX_TOTAL_CONNECTIONS:
                return obj;
            case 21:
                return Boolean.valueOf(!(((rg6) obj) instanceof qg6));
            case 22:
                return Long.valueOf(((rg6) obj).getId());
            case 23:
                return String.valueOf(((t1c) obj).a);
            case 24:
                nrc nrc = (nrc) obj;
                return nrc.getItemId() + "/" + m4b.k(nrc.a);
            case 25:
                return String.valueOf(((lk3) obj).a);
            case 26:
                OneMeButton oneMeButton = (OneMeButton) obj;
                k77[] k77Arr3 = InputNameScreen.F0;
                oneMeButton.setText(utb.oneme_login_input_name_continue_button_disabled);
                oneMeButton.setMode(u0a);
                oneMeButton.setAppearance(s0a);
                oneMeButton.setSize(v0a);
                oneMeButton.setEnabled(false);
                return jue;
            case 27:
                OneMeButton oneMeButton2 = (OneMeButton) obj;
                k77[] k77Arr4 = InputNameScreen.F0;
                oneMeButton2.setId(jpb.oneme_login_input_name_continue_btn);
                oneMeButton2.setText(utb.oneme_login_input_name_continue_button_active);
                oneMeButton2.setMode(u0a);
                oneMeButton2.setAppearance(s0a);
                oneMeButton2.setSize(v0a);
                oneMeButton2.setEnabled(true);
                return jue;
            case 28:
                return r1g.l(((TamErrorException) obj).a);
            default:
                return r1g.l(((TamErrorException) obj).a);
        }
    }
}
