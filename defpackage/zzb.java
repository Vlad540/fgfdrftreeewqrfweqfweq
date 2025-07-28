package defpackage;

import java.lang.ref.WeakReference;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: zzb  reason: default package */
public final /* synthetic */ class zzb implements vzc {
    public final /* synthetic */ WeakReference a;

    public /* synthetic */ zzb(WeakReference weakReference) {
        this.a = weakReference;
    }

    public final void a() {
        dbc dbc;
        ReactionsViewModel reactionsViewModel = (ReactionsViewModel) this.a.get();
        if (reactionsViewModel != null && (dbc = reactionsViewModel.r) != null) {
            dbc.b();
        }
    }
}
