package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import java.util.HashMap;
import java.util.HashSet;
import java.util.WeakHashMap;

/* renamed from: ix2  reason: default package */
public final class ix2 implements ViewGroup.OnHierarchyChangeListener {
    public ViewGroup.OnHierarchyChangeListener a;
    public final /* synthetic */ ChipGroup b;

    public ix2(ChipGroup chipGroup) {
        this.b = chipGroup;
    }

    public final void onChildViewAdded(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            if (view2.getId() == -1) {
                WeakHashMap weakHashMap = eaf.a;
                view2.setId(View.generateViewId());
            }
            lga lga = chipGroup.z0;
            Chip chip = (Chip) view2;
            ((HashMap) lga.c).put(Integer.valueOf(chip.getId()), chip);
            if (chip.isChecked()) {
                lga.f(chip);
            }
            chip.setInternalOnCheckedChangeListener(new lhd(9, lga));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    public final void onChildViewRemoved(View view, View view2) {
        ChipGroup chipGroup = this.b;
        if (view == chipGroup && (view2 instanceof Chip)) {
            lga lga = chipGroup.z0;
            Chip chip = (Chip) view2;
            lga.getClass();
            chip.setInternalOnCheckedChangeListener((hw7) null);
            ((HashMap) lga.c).remove(Integer.valueOf(chip.getId()));
            ((HashSet) lga.o).remove(Integer.valueOf(chip.getId()));
        }
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.a;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
