package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: tka  reason: default package */
public final class tka implements ActionMode.Callback {
    public final Context a;
    public final u16 b;

    public tka(Context context, e98 e98) {
        this.a = context;
        this.b = e98;
    }

    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        ClipData.Item itemAt;
        CharSequence charSequence = null;
        Integer valueOf = menuItem != null ? Integer.valueOf(menuItem.getItemId()) : null;
        if (valueOf == null || valueOf.intValue() != 16908322) {
            return false;
        }
        ClipData primaryClip = ((ClipboardManager) this.a.getSystemService("clipboard")).getPrimaryClip();
        if (!(primaryClip == null || (itemAt = primaryClip.getItemAt(0)) == null)) {
            charSequence = itemAt.getText();
        }
        return ((Boolean) this.b.invoke(charSequence)).booleanValue();
    }

    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return true;
    }

    public final void onDestroyActionMode(ActionMode actionMode) {
    }

    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        MenuItem findItem = menu.findItem(16908322);
        if (findItem == null) {
            return false;
        }
        menu.clear();
        menu.add(0, 16908322, 0, findItem.getTitle());
        return true;
    }
}
