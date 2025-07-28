package one.me.profile.screens.addadmins;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profile/screens/addadmins/AddChatAdminsScreen;", "Lone/me/sdk/arch/Widget;", "Loaa;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "chatId", "(J)V", "profile_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class AddChatAdminsScreen extends Widget implements oaa {
    public static final /* synthetic */ k77[] B0;
    public ur3 A0;
    public final t97 X;
    public final n0c Y;
    public final n0c Z;
    public final jj7 a;
    public final sy6 b;
    public final jr c;
    public final String o;
    public final n0c w0;
    public final boolean x0;
    public final u5g y0;
    public final i9 z0;

    static {
        Class<AddChatAdminsScreen> cls = AddChatAdminsScreen.class;
        k77 khb = new khb(cls, ApiProtocol.PARAM_CHAT_ID, "getChatId()J", 0);
        n7c n7c = m7c.a;
        B0 = new k77[]{khb, wn6.e(n7c, cls, "toolbar", "getToolbar()Lone/me/sdk/uikit/common/toolbar/OneMeToolbar;", 0), wn6.f(cls, "tabsView", "getTabsView()Lone/me/common/tablayout/OneMeTabLayout;", 0, n7c), wn6.f(cls, "viewPager", "getViewPager()Landroidx/viewpager2/widget/ViewPager2;", 0, n7c)};
    }

    public AddChatAdminsScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        List B;
        this.a = new jj7(new m(1), (s16) null, 6);
        this.b = sy6.d;
        this.c = new jr(Long.class, "profile:add_admins:chat_id");
        String j = us8.j(l0(), "profile:add_admins:{", "}");
        this.o = j;
        this.X = createViewModelLazy(lj8.class, new s(2, new c6(2, this)));
        this.Y = viewBinding(j8a.f);
        this.Z = viewBinding(j8a.e);
        this.w0 = viewBinding(j8a.g);
        boolean s = ((kb5) ((jb5) i6b.a.g().getValue())).s();
        this.x0 = s;
        if (s) {
            B = Collections.singletonList(new k9(j8a.c, l8a.N, 1));
        } else {
            B = p23.B(new k9[]{new k9(j8a.c, l8a.N, 1), new k9(j8a.d, l8a.O, 2)});
        }
        List list = B;
        this.y0 = new u5g(1, list);
        this.z0 = new i9(l0(), j, list, this);
    }

    public final void I(CharSequence charSequence) {
        ((lj8) this.X.getValue()).u(String.valueOf(charSequence));
    }

    public final void T() {
        ((lj8) this.X.getValue()).u((String) null);
    }

    public final sy6 getInsetsConfig() {
        return this.b;
    }

    /* renamed from: getScopeId-IluPPks  reason: not valid java name */
    public final String m11getScopeIdIluPPks() {
        return this.o;
    }

    public final rnc getScreenDelegate() {
        return this.a;
    }

    public final long l0() {
        k77 k77 = B0[0];
        return ((Number) this.c.a(this)).longValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        nea nea = new nea(linearLayout.getContext(), 6);
        nea.setId(j8a.f);
        nea.setTitle(l8a.P);
        nea.setLeftActions(new wda(new l(2, this)));
        nea.setRightActions(new aea((jea) null, new iea(this)));
        linearLayout.addView(nea);
        hda hda = new hda(linearLayout.getContext(), (AttributeSet) null);
        hda.setId(j8a.e);
        hda.setLayoutParams(new dm(-1, -2));
        hda.setTabMode(1);
        hda.setElevation(dh4.c().getDisplayMetrics().density * 10.0f);
        hda.setVisibility(this.x0 ^ true ? 0 : 8);
        linearLayout.addView(hda);
        ViewPager2 viewPager2 = new ViewPager2(linearLayout.getContext());
        viewPager2.setId(j8a.g);
        viewPager2.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        swb.r(viewPager2);
        linearLayout.addView(viewPager2);
        return linearLayout;
    }

    public final void onDestroyView(View view) {
        k77[] k77Arr = B0;
        bm3.r((nea) this.Y.T0(this, k77Arr[1]));
        if (!requireActivity().isChangingConfigurations()) {
            ((ViewPager2) this.w0.T0(this, k77Arr[3])).setAdapter((f6c) null);
        }
        ur3 ur3 = this.A0;
        if (ur3 != null) {
            ur3.c();
        }
        this.A0 = null;
    }

    public final void onViewCreated(View view) {
        k77[] k77Arr = B0;
        k77 k77 = k77Arr[3];
        n0c n0c = this.w0;
        ViewPager2 viewPager2 = (ViewPager2) n0c.T0(this, k77);
        viewPager2.setAdapter(this.z0);
        viewPager2.setOffscreenPageLimit(1);
        if (!this.x0) {
            hda hda = (hda) this.Z.T0(this, k77Arr[2]);
            u5g u5g = this.y0;
            u5g.getClass();
            ur3 ur3 = new ur3(hda, (ViewPager2) n0c.T0(this, k77Arr[3]), new j9(u5g, 0, hda));
            ur3.a();
            this.A0 = ur3;
        }
        ez3.N(new ck5(wx3.e(((lj8) this.X.getValue()).X, getViewLifecycleOwner().R(), ob7.o), new l9((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final void p() {
        ((lj8) this.X.getValue()).u((String) null);
    }

    public AddChatAdminsScreen(long j) {
        this(jjd.j(new wia[]{new wia("profile:add_admins:chat_id", Long.valueOf(j))}));
    }
}
