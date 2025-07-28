package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import java.util.Objects;

/* renamed from: y9f  reason: default package */
public abstract class y9f {
    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View$OnUnhandledKeyEventListener, java.lang.Object] */
    public static void a(View view, daf daf) {
        kgd kgd = (kgd) view.getTag(wpb.tag_unhandled_key_listeners);
        if (kgd == null) {
            kgd = new kgd();
            view.setTag(wpb.tag_unhandled_key_listeners, kgd);
        }
        Objects.requireNonNull(daf);
        ? obj = new Object();
        kgd.put(daf, obj);
        view.addOnUnhandledKeyEventListener(obj);
    }

    public static CharSequence b(View view) {
        return view.getAccessibilityPaneTitle();
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean d(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void e(View view, daf daf) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        kgd kgd = (kgd) view.getTag(wpb.tag_unhandled_key_listeners);
        if (kgd != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) kgd.get(daf)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static <T> T f(View view, int i) {
        return view.requireViewById(i);
    }

    public static void g(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static void h(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static void i(View view, ob0 ob0) {
        view.setAutofillId((AutofillId) null);
    }

    public static void j(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }
}
