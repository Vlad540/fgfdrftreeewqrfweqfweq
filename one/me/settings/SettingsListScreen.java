package one.me.settings;

import android.content.Intent;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.sections.SectionRecyclerWidget;
import ru.ok.tamtam.nano.Protos;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lone/me/settings/SettingsListScreen;", "Lone/me/sdk/sections/SectionRecyclerWidget;", "Lf7d;", "Lem;", "Llc3;", "Lac0;", "<init>", "()V", "settings-screen_release"}, k = 1, mv = {2, 0, 0})
public final class SettingsListScreen extends SectionRecyclerWidget implements f7d, em, lc3, ac0 {
    public static final /* synthetic */ k77[] D0;
    public fm A0;
    public final g7d B0;
    public final i41 C0;
    public final t97 X = createViewModelLazy(v4d.class, new wq9(26, new vfc(20)));
    public final n0c Y = viewBinding(yaa.j);
    public final n0c Z = viewBinding(yaa.i);
    public final sy6 o = sy6.d;
    public final t97 w0 = ez3.O(3, new u5b(21, this));
    public final t97 x0;
    public final t97 y0;
    public final ExecutorService z0;

    static {
        Class<SettingsListScreen> cls = SettingsListScreen.class;
        D0 = new k77[]{new khb(cls, "settingsCollapsingContent", "getSettingsCollapsingContent()Lone/me/settings/ui/collapsingtoolbar/SettingsTopBarContent;", 0), wn6.e(m7c.a, cls, "settingsPinnedToolbar", "getSettingsPinnedToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0)};
    }

    public SettingsListScreen() {
        s7d s7d = s7d.a;
        this.x0 = s7d.getAccessor().d(qna.class);
        this.y0 = s7d.getAccessor().d(xg9.class);
        ExecutorService a = ((x4a) s7d.getAccessor().c(x4a.class)).a();
        this.z0 = a;
        this.B0 = new g7d(this, a);
        this.C0 = new i41(a, 5);
        t0c t0c = p0().E0;
        pc7 R = this.lifecycleOwner.R();
        ob7 ob7 = ob7.o;
        ez3.N(new ck5(wx3.e(t0c, R, ob7), new y7d(this, (Continuation) null), 5), getLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().G0, this.lifecycleOwner.R(), ob7), new z7d(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final void U(fm fmVar, int i) {
        if (fmVar != null) {
            float abs = ((float) Math.abs(i)) / ((float) fmVar.getTotalScrollRange());
            ((nea) this.Z.T0(this, D0[1])).setTitleAlpha(abs);
            o0().setAlpha(1.0f - abs);
        }
    }

    public final void W(long j, boolean z) {
    }

    public final void a(String str, RectF rectF, Rect rect) {
        v4d p0 = p0();
        xs7.E(p0.a, p0.r().b(), (ru3) null, new r4d(rectF, p0, str, (Continuation) null), 2);
    }

    public final sy6 getInsetsConfig() {
        return this.o;
    }

    public final void h(long j) {
        Object obj;
        a34 a34;
        v4d p0 = p0();
        p0.getClass();
        f4d.b.getClass();
        u1 it = f4d.E0.iterator();
        while (true) {
            u1 u1Var = it;
            if (!u1Var.hasNext()) {
                obj = null;
                break;
            }
            obj = u1Var.next();
            if (((long) ((f4d) obj).ordinal()) == j) {
                break;
            }
        }
        f4d f4d = (f4d) obj;
        switch (f4d == null ? -1 : n4d.$EnumSwitchMapping$0[f4d.ordinal()]) {
            case -1:
                return;
            case 1:
                w7d.c.getClass();
                a34 = new a34(":settings/folder-list");
                break;
            case 2:
                w7d.c.getClass();
                a34 = new a34(":settings/appearance");
                break;
            case 3:
                w7d.c.getClass();
                a34 = new a34(":settings/notifications");
                break;
            case 4:
                w7d.c.getClass();
                a34 = new a34(":settings/privacy");
                break;
            case 5:
                w7d.c.getClass();
                a34 = new a34(":settings/messages");
                break;
            case 6:
                w7d.c.getClass();
                a34 = new a34(":webview/faq");
                break;
            case 7:
                w7d.c.getClass();
                a34 = new a34(":settings/dev");
                break;
            case 8:
                w7d.c.getClass();
                a34 = new a34(":settings/media");
                break;
            case 9:
                w7d.c.getClass();
                a34 = new a34(":settings/caching");
                break;
            case 10:
                w7d.c.getClass();
                a34 = new a34(":settings/aboutapp");
                break;
            case 11:
                w7d w7d = w7d.c;
                long o2 = ((j2b) p0.s()).b.o(uqc.c, -1);
                qr4 qr4 = bff.c;
                w7d.getClass();
                a34 = new a34(":webapp:root?bot_id=" + o2 + "&entry_point=settings");
                break;
            case Protos.Attaches.Attach.PRESENT /*12*/:
                taf.n(p0, p0.r().a(), (ru3) null, new t4d(p0, (Continuation) null), 2);
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
        taf.o(p0.B0, a34);
    }

    public final void i(int i, Bundle bundle) {
        v4d p0 = p0();
        p0.getClass();
        int i2 = yaa.d;
        l05 l05 = p0.B0;
        if (i == i2) {
            Long t = p0.t();
            if (t != null) {
                long longValue = t.longValue();
                w7d.c.getClass();
                rf0.j(":neuro-avatars?id=" + longValue, l05);
            }
        } else if (i == yaa.c) {
            taf.o(l05, s8d.b);
        } else if (i == yaa.b) {
            p0.u();
        }
    }

    public final i41 l0() {
        return this.C0;
    }

    public final g7d m0() {
        return this.B0;
    }

    public final v9d o0() {
        return (v9d) this.Y.T0(this, D0[0]);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        SettingsListScreen.super.onActivityResult(i, i2, intent);
        if (i != 333) {
            if (i != 666 || i2 != -1) {
                return;
            }
            if (intent == null) {
                udd.s(SettingsListScreen.class.getName(), "data from ActAvatarCrop is null", (Throwable) null);
                p0().w();
                return;
            }
            v4d p0 = p0();
            xs7.E(p0.a, p0.r().b(), (ru3) null, new s4d(intent, p0, (Continuation) null), 2);
        } else if (i2 == -1) {
            v4d p02 = p0();
            xs7.E(p02.a, p02.r().b(), (ru3) null, new o4d(p02, intent != null ? intent.getData() : null, (Continuation) null), 2);
        }
    }

    public final void onAttach(View view) {
        SettingsListScreen.super.onAttach(view);
        p0().q();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        x7d x7d = new x7d(this, 0);
        CoordinatorLayout coordinatorLayout = new CoordinatorLayout(getContext(), (AttributeSet) null);
        coordinatorLayout.setId(yaa.f);
        coordinatorLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        urd.B(new q9b(3, (Continuation) null, 1), coordinatorLayout);
        x7d.invoke(coordinatorLayout);
        return coordinatorLayout;
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (i == 158 && ((qna) this.x0.getValue()).b(strArr)) {
            p0().u();
        }
        p0().q();
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        fm fmVar = this.A0;
        if (fmVar != null) {
            fmVar.a(am7.F(this, fmVar, getViewLifecycleOwner()));
        }
        o0().setAvatarClickedListener(new e78(0, p0(), v4d.class, "openUserAvatars", "openUserAvatars()V", 0, 9));
        o0().setNicknameClickListener(new e78(0, p0(), v4d.class, "copyProfileLink", "copyProfileLink()V", 0, 10));
        o0().setUserPhoneClickListener(new e78(0, p0(), v4d.class, "copyUserPhone", "copyUserPhone()V", 0, 11));
        ez3.N(new ck5(wx3.e(p0().B0, this.lifecycleOwner.R(), ob7.X), new b8d(this, (Continuation) null), 5), getViewLifecycleScope());
        ez3.N(new ck5(wx3.e(p0().C0, this.lifecycleOwner.R(), ob7.o), new a8d(this, (Continuation) null), 5), getLifecycleScope());
    }

    public final v4d p0() {
        return (v4d) this.X.getValue();
    }
}
