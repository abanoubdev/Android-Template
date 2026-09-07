package net.compose.leadandroiddevprep.products.navigation

import androidx.compose.runtime.Composable
import androidx.navigation3.runtime.EntryProviderScope
import androidx.navigation3.runtime.NavBackStack
import androidx.navigation3.runtime.NavKey
import kotlinx.serialization.Serializable
import net.compose.leadandroiddevprep.products.presentation.ProductsScreenComposable

@Serializable
data object Products : NavKey

@Composable
fun EntryProviderScope<NavKey>.ProductsEntryProvider(
    backStack: NavBackStack<NavKey>,
    onNavigateToDetails: (Int) -> Unit
) {
    entry<Products> {
        ProductsScreenComposable(onNavigateToDetails = onNavigateToDetails)
    }
}