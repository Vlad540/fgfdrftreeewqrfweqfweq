package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* renamed from: km8  reason: default package */
public class km8 extends ibe implements Menu {
    public final pl8 o;

    public km8(Context context, pl8 pl8) {
        super(context);
        if (pl8 != null) {
            this.o = pl8;
            return;
        }
        throw new IllegalArgumentException("Wrapped Object can not be null.");
    }

    public final MenuItem add(CharSequence charSequence) {
        return M(this.o.add(charSequence));
    }

    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr;
        MenuItem[] menuItemArr3 = menuItemArr2 != null ? new MenuItem[menuItemArr2.length] : null;
        int addIntentOptions = this.o.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr3);
        if (menuItemArr3 != null) {
            int length = menuItemArr3.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr2[i5] = M(menuItemArr3[i5]);
            }
        }
        return addIntentOptions;
    }

    public final SubMenu addSubMenu(CharSequence charSequence) {
        return this.o.addSubMenu(charSequence);
    }

    public final void clear() {
        kgd kgd = (kgd) this.c;
        if (kgd != null) {
            kgd.clear();
        }
        this.o.clear();
    }

    public final void close() {
        this.o.close();
    }

    public final MenuItem findItem(int i) {
        return M(this.o.findItem(i));
    }

    public final MenuItem getItem(int i) {
        return M(this.o.getItem(i));
    }

    public final boolean hasVisibleItems() {
        return this.o.hasVisibleItems();
    }

    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.o.isShortcutKey(i, keyEvent);
    }

    public final boolean performIdentifierAction(int i, int i2) {
        return this.o.performIdentifierAction(i, i2);
    }

    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.o.performShortcut(i, keyEvent, i2);
    }

    public final void removeGroup(int i) {
        if (((kgd) this.c) != null) {
            int i2 = 0;
            while (true) {
                kgd kgd = (kgd) this.c;
                if (i2 >= kgd.c) {
                    break;
                }
                if (((b4e) kgd.f(i2)).getGroupId() == i) {
                    ((kgd) this.c).g(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.o.removeGroup(i);
    }

    public final void removeItem(int i) {
        if (((kgd) this.c) != null) {
            int i2 = 0;
            while (true) {
                kgd kgd = (kgd) this.c;
                if (i2 >= kgd.c) {
                    break;
                } else if (((b4e) kgd.f(i2)).getItemId() == i) {
                    ((kgd) this.c).g(i2);
                    break;
                } else {
                    i2++;
                }
            }
        }
        this.o.removeItem(i);
    }

    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.o.setGroupCheckable(i, z, z2);
    }

    public final void setGroupEnabled(int i, boolean z) {
        this.o.setGroupEnabled(i, z);
    }

    public final void setGroupVisible(int i, boolean z) {
        this.o.setGroupVisible(i, z);
    }

    public final void setQwertyMode(boolean z) {
        this.o.setQwertyMode(z);
    }

    public final int size() {
        return this.o.size();
    }

    public final MenuItem add(int i) {
        return M(this.o.add(i));
    }

    public final SubMenu addSubMenu(int i) {
        return this.o.addSubMenu(i);
    }

    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return M(this.o.add(i, i2, i3, charSequence));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return this.o.addSubMenu(i, i2, i3, charSequence);
    }

    public final MenuItem add(int i, int i2, int i3, int i4) {
        return M(this.o.add(i, i2, i3, i4));
    }

    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return this.o.addSubMenu(i, i2, i3, i4);
    }
}
