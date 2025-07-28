package one.me.chats.picker.contacts;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import java.util.Collections;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import one.me.chats.picker.AbstractPickerScreen;
import one.me.sdk.arch.Widget;
import one.me.sdk.uikit.common.button.OneMeButton;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lone/me/chats/picker/contacts/ContactsPickerScreen;", "Lone/me/chats/picker/AbstractPickerScreen;", "Lxo3;", "Lrg9;", "Landroid/os/Bundle;", "args", "<init>", "(Landroid/os/Bundle;)V", "", "requestCode", "(I)V", "chats-list_release"}, k = 1, mv = {2, 0, 0})
@SuppressLint({"ValidController"})
public final class ContactsPickerScreen extends AbstractPickerScreen<xo3> implements rg9 {
    public static final /* synthetic */ k77[] z0;
    public final jr x0;
    public final j54 y0;

    static {
        khb khb = new khb(ContactsPickerScreen.class, "requestCode", "getRequestCode()I", 0);
        m7c.a.getClass();
        z0 = new k77[]{khb};
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [rr3, one.me.chats.picker.contacts.ContactsPickerScreen, java.lang.Object] */
    public ContactsPickerScreen(Bundle bundle) {
        super(bundle);
        this.x0 = new jr(Integer.class, 0, "contacts.picker.request_code.key");
        hq0 hq0 = new hq0(this, new nl1(23, this));
        if (getRouter() != null) {
            getRouter().a(hq0);
        } else {
            addLifecycleListener(new s9(this, hq0, 1));
        }
        tp2 tp2 = tp2.a;
        this.y0 = new j54((t97) tp2.getAccessor().d(f03.class), (t97) tp2.getAccessor().d(pae.class), (t97) null, 12);
    }

    public final Iterable l0() {
        OneMeButton oneMeButton = new OneMeButton(getContext(), (AttributeSet) null);
        oneMeButton.setSize(v0a.c);
        oneMeButton.setAppearance(s0a.o);
        oneMeButton.setMode(u0a.a);
        oneMeButton.setText(h2a.I);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        int X = a24.X(((float) 12) * dh4.c().getDisplayMetrics().density);
        layoutParams.setMargins(X, X, X, X);
        oneMeButton.setLayoutParams(layoutParams);
        a24.Z(oneMeButton, 300, new d5(23, this));
        ez3.N(new ck5(u0().Z, new so3(oneMeButton, (Continuation) null), 5), getViewLifecycleScope());
        return Collections.singletonList(oneMeButton);
    }

    public final lta m0() {
        return new otf(tp2.a.getAccessor().d(ok3.class), this.y0, false);
    }

    public final Widget n0(String str) {
        return new PickerContactsListWidget(str, (x54) null);
    }

    public final mnc o() {
        return mnc.V0;
    }

    public final nea o0(Context context) {
        nea nea = new nea(context, 6);
        nea.setId(f2a.Z);
        nea.setTitle(h2a.J);
        nea.setForm(fea.a);
        nea.setLeftActions(new wda(new gw2(3, this)));
        return nea;
    }

    public final void onViewCreated(View view) {
        super.onViewCreated(view);
        urd.B(new uo3(3, (Continuation) null, 0), view);
        ez3.N(new ck5(wx3.e(((xo3) u0().c).g, getViewLifecycleOwner().R(), ob7.o), new to3((Continuation) null, this), 5), getViewLifecycleScope());
    }

    public final mua p0() {
        tp2 tp2 = tp2.a;
        return new xo3(this.y0, tp2.getAccessor().d(ok3.class), tp2.getAccessor().d(pae.class));
    }

    public final zqd r0() {
        return hrd.a(new hge(h2a.H));
    }

    public final Set v0(Bundle bundle) {
        return qw4.a;
    }

    public ContactsPickerScreen(int i) {
        this(jjd.j(new wia("contacts.picker.request_code.key", Integer.valueOf(i))));
    }
}
