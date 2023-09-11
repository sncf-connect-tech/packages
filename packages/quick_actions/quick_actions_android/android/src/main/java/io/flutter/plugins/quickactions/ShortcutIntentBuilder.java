package io.flutter.plugins.quickactions;

import android.content.Intent;

public interface ShortcutIntentBuilder {
    Intent buildIntent(String type);
}
