package one.me.chats.picker;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.appbar.AppBarLayout$ScrollingViewBehavior;
import kotlin.Metadata;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lone/me/chats/picker/ActChatPickerCompat;", "Lim;", "<init>", "()V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
public final class ActChatPickerCompat extends im {
    public static final int P0 = View.generateViewId();
    public final t97 O0 = tp2.a.getAccessor().d(pae.class);

    /* JADX WARNING: type inference failed for: r0v8, types: [rr3, one.me.chats.picker.PickerChatController] */
    public final void onCreate(Bundle bundle) {
        Bundle bundle2;
        lr4.a(this);
        getWindow().clearFlags(LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        t5 t5Var = new t5(this);
        az1 b = x87.b(t5Var.getContext());
        int i = P0;
        b.setId(i);
        nt3 nt3 = new nt3(-1, -1);
        nt3.b(new AppBarLayout$ScrollingViewBehavior());
        t5Var.addView(b, nt3);
        t5Var.onThemeChanged(km4.y0.n(this).g());
        setContentView((View) t5Var);
        super.onCreate(bundle);
        sgc c = bm3.c(this, (ViewGroup) findViewById(i), bundle);
        c.Q(true);
        c.e = 3;
        if (!c.n()) {
            Intent intent = getIntent();
            if (intent == null || (bundle2 = intent.getExtras()) == null) {
                bundle2 = new Bundle();
            }
            c.R(n06.f(new PickerChatController(bundle2), (wr3) null, (wr3) null));
        }
        c.a(new u5(0, this));
    }
}
