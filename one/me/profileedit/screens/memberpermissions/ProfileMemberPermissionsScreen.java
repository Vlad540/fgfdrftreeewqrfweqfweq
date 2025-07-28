package one.me.profileedit.screens.memberpermissions;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.sdk.arch.Widget;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\t¨\u0006\n"}, d2 = {"Lone/me/profileedit/screens/memberpermissions/ProfileMemberPermissionsScreen;", "Lone/me/sdk/arch/Widget;", "Ltcb;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "id", "(J)V", "profile-edit_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ProfileMemberPermissionsScreen extends Widget implements tcb {
    public static final /* synthetic */ int o = 0;
    public final sy6 a;
    public final t97 b;
    public final ucb c;

    public ProfileMemberPermissionsScreen(Bundle bundle) {
        super(bundle, 0, 2, (x54) null);
        this.a = sy6.d;
        this.b = createViewModelLazy(jdb.class, new wq9(17, new fe2(bundle, 6)));
        this.c = new ucb(((x4a) z7b.a.getAccessor().c(x4a.class)).a(), this);
    }

    public final sy6 getInsetsConfig() {
        return this.a;
    }

    public final boolean handleBack() {
        jdb l0 = l0();
        l0.getClass();
        taf.o(l0.B0, v03.b);
        return true;
    }

    public final jdb l0() {
        return (jdb) this.b.getValue();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        wcb wcb = new wcb(this, 0);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        urd.B(new o(3, (Continuation) null, 10), linearLayout);
        wcb.invoke(linearLayout);
        return linearLayout;
    }

    public final void onViewCreated(View view) {
        ez3.N(new ck5(l0().A0, new kbb(2, this.c, ucb.class, "submitList", "submitList(Ljava/util/List;)V", 4, 1), 5), getViewLifecycleScope());
        ez3.N(new ck5(l0().B0, new l5e(2, (Continuation) null), 5), getViewLifecycleScope());
    }

    public ProfileMemberPermissionsScreen(long j) {
        this(jjd.j(new wia[]{new wia(ApiProtocol.KEY_ID, Long.valueOf(j))}));
    }
}
