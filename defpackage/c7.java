package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* renamed from: c7  reason: default package */
public final class c7 implements b4e {
    public ColorStateList A0 = null;
    public PorterDuff.Mode B0 = null;
    public boolean C0 = false;
    public boolean D0 = false;
    public int E0 = 16;
    public int X = 4096;
    public char Y;
    public int Z = 4096;
    public CharSequence a;
    public CharSequence b;
    public Intent c;
    public char o;
    public Drawable w0;
    public final Context x0;
    public CharSequence y0;
    public CharSequence z0;

    public c7(Context context, CharSequence charSequence) {
        this.x0 = context;
        this.a = charSequence;
    }

    public final b4e a(o7 o7Var) {
        throw new UnsupportedOperationException();
    }

    public final o7 b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.w0;
        if (drawable == null) {
            return;
        }
        if (this.C0 || this.D0) {
            this.w0 = drawable;
            Drawable mutate = drawable.mutate();
            this.w0 = mutate;
            if (this.C0) {
                um4.h(mutate, this.A0);
            }
            if (this.D0) {
                um4.i(this.w0, this.B0);
            }
        }
    }

    public final boolean collapseActionView() {
        return false;
    }

    public final boolean expandActionView() {
        return false;
    }

    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    public final View getActionView() {
        return null;
    }

    public final int getAlphabeticModifiers() {
        return this.Z;
    }

    public final char getAlphabeticShortcut() {
        return this.Y;
    }

    public final CharSequence getContentDescription() {
        return this.y0;
    }

    public final int getGroupId() {
        return 0;
    }

    public final Drawable getIcon() {
        return this.w0;
    }

    public final ColorStateList getIconTintList() {
        return this.A0;
    }

    public final PorterDuff.Mode getIconTintMode() {
        return this.B0;
    }

    public final Intent getIntent() {
        return this.c;
    }

    public final int getItemId() {
        return 16908332;
    }

    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    public final int getNumericModifiers() {
        return this.X;
    }

    public final char getNumericShortcut() {
        return this.o;
    }

    public final int getOrder() {
        return 0;
    }

    public final SubMenu getSubMenu() {
        return null;
    }

    public final CharSequence getTitle() {
        return this.a;
    }

    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.b;
        return charSequence != null ? charSequence : this.a;
    }

    public final CharSequence getTooltipText() {
        return this.z0;
    }

    public final boolean hasSubMenu() {
        return false;
    }

    public final boolean isActionViewExpanded() {
        return false;
    }

    public final boolean isCheckable() {
        return (this.E0 & 1) != 0;
    }

    public final boolean isChecked() {
        return (this.E0 & 2) != 0;
    }

    public final boolean isEnabled() {
        return (this.E0 & 16) != 0;
    }

    public final boolean isVisible() {
        return (this.E0 & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2) {
        this.Y = Character.toLowerCase(c2);
        return this;
    }

    public final MenuItem setCheckable(boolean z) {
        this.E0 = z | (this.E0 & true) ? 1 : 0;
        return this;
    }

    public final MenuItem setChecked(boolean z) {
        this.E0 = (z ? 2 : 0) | (this.E0 & -3);
        return this;
    }

    /* renamed from: setContentDescription  reason: collision with other method in class */
    public final b4e m12setContentDescription(CharSequence charSequence) {
        this.y0 = charSequence;
        return this;
    }

    public final MenuItem setEnabled(boolean z) {
        this.E0 = (z ? 16 : 0) | (this.E0 & -17);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable) {
        this.w0 = drawable;
        c();
        return this;
    }

    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.A0 = colorStateList;
        this.C0 = true;
        c();
        return this;
    }

    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.B0 = mode;
        this.D0 = true;
        c();
        return this;
    }

    public final MenuItem setIntent(Intent intent) {
        this.c = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2) {
        this.o = c2;
        return this;
    }

    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3) {
        this.o = c2;
        this.Y = Character.toLowerCase(c3);
        return this;
    }

    public final void setShowAsAction(int i) {
    }

    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    public final MenuItem setTitle(CharSequence charSequence) {
        this.a = charSequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.b = charSequence;
        return this;
    }

    /* renamed from: setTooltipText  reason: collision with other method in class */
    public final b4e m13setTooltipText(CharSequence charSequence) {
        this.z0 = charSequence;
        return this;
    }

    public final MenuItem setVisible(boolean z) {
        int i = 8;
        int i2 = this.E0 & 8;
        if (z) {
            i = 0;
        }
        this.E0 = i2 | i;
        return this;
    }

    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setAlphabeticShortcut(char c2, int i) {
        this.Y = Character.toLowerCase(c2);
        this.Z = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.y0 = charSequence;
        return this;
    }

    public final MenuItem setNumericShortcut(char c2, int i) {
        this.o = c2;
        this.X = KeyEvent.normalizeMetaState(i);
        return this;
    }

    public final MenuItem setTitle(int i) {
        this.a = this.x0.getResources().getString(i);
        return this;
    }

    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.z0 = charSequence;
        return this;
    }

    public final MenuItem setIcon(int i) {
        this.w0 = gq3.b(this.x0, i);
        c();
        return this;
    }

    public final MenuItem setShortcut(char c2, char c3, int i, int i2) {
        this.o = c2;
        this.X = KeyEvent.normalizeMetaState(i);
        this.Y = Character.toLowerCase(c3);
        this.Z = KeyEvent.normalizeMetaState(i2);
        return this;
    }
}
