package fr.echoeslabs.migration.api.refactoring;

public interface IRefactoringListener {

	void notifyRefactoring(IRefactoringNotification notification);
}
