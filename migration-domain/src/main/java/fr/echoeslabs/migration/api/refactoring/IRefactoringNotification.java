package fr.echoeslabs.migration.api.refactoring;

import fr.echoeslabs.migration.api.sources.fragments.ISourceFragment;

public interface IRefactoringNotification {

	ISourceFragment getRefactoredFragment();

	IRefactoring getRefactoring();
}
