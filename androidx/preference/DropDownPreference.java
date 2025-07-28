package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ArrayAdapter;

public class DropDownPreference extends ListPreference {
    public final ArrayAdapter z0;

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, ulb.dropdownPreferenceStyle);
        ArrayAdapter arrayAdapter = new ArrayAdapter(context, 17367049);
        this.z0 = arrayAdapter;
        arrayAdapter.clear();
        CharSequence[] charSequenceArr = this.x0;
        if (charSequenceArr != null) {
            for (CharSequence charSequence : charSequenceArr) {
                arrayAdapter.add(charSequence.toString());
            }
        }
    }

    public final void b() {
        ArrayAdapter arrayAdapter = this.z0;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }
}
