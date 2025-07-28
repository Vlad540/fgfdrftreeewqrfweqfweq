package ru.ok.tamtam.materialdialogs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lru/ok/tamtam/materialdialogs/TamDialogSelectItemTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Lade;", "material-dialogs_release"}, k = 1, mv = {2, 0, 0})
public final class TamDialogSelectItemTextView extends AppCompatTextView implements ade {
    /* JADX WARNING: type inference failed for: r1v0, types: [ade, android.widget.TextView, android.view.View, ru.ok.tamtam.materialdialogs.TamDialogSelectItemTextView] */
    public TamDialogSelectItemTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        wce wce;
        E(this);
        if (isInEditMode()) {
            wce = db4.e0;
        } else {
            Context context2 = getContext();
            r7e r7e = wce.a0;
            wce = fja.E(context2);
        }
        z(wce);
        nte.k.b(this, yq4.b);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [android.widget.TextView, ru.ok.tamtam.materialdialogs.TamDialogSelectItemTextView] */
    public final void z(wce wce) {
        setTextColor(wce.F);
    }
}
