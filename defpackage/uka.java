package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;

/* renamed from: uka  reason: default package */
public final class uka implements ActionMode.Callback {
    public final Context a;
    public final cx6 b;
    public final int c;
    public final int d;

    public uka(Context context, cx6 cx6, int i, int i2) {
        this.a = context;
        this.b = cx6;
        this.c = i;
        this.d = i2;
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
        if (charSequence == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String obj = h0e.x0(this.d, sb).toString();
        ((hc3) this.b).J0(this.c, obj);
        return obj.length() > 0;
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
