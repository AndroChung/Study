#include <iostream>
#include <vector>
#include <stack>

double calculatePostExpression(std::string, std::vector<double>&);
double sumPostExpression(std::stack<double>&);
double subtractPostExpression(std::stack<double>&);
double multiplyPostExpression(std::stack<double>&);
double dividePostExpression(std::stack<double>&);

int main() {
    using namespace std;

    int N;
    cin >> N;
    string expression;
    cin >> expression;
    vector<double> operand(N);

    for (int i = 0; i < N; i++) {
        cin >> operand[i];
    }
    cout << fixed;
	cout.precision(2);
    cout << calculatePostExpression(expression, operand) << endl;
    
    return 0;
}

double calculatePostExpression(std::string expression, std::vector<double>& operand) {
    using namespace std;

    stack<double> postExpressionStack;

    for (char ch : expression) {
        switch(ch) {
            case '+':
                postExpressionStack.push(sumPostExpression(postExpressionStack));
                break;
            case '-':
                postExpressionStack.push(subtractPostExpression(postExpressionStack));
                break;
            case '*':
                postExpressionStack.push(multiplyPostExpression(postExpressionStack));
                break;
            case '/':
                postExpressionStack.push(dividePostExpression(postExpressionStack));
                break;
            default:
                postExpressionStack.push(operand[ch - 'A']);
        }
    }
    return postExpressionStack.top();
}
double sumPostExpression(std::stack<double>& postExpressionStack) {
    double op1, op2;
    op2 = postExpressionStack.top();
    postExpressionStack.pop();
    op1 = postExpressionStack.top();
    postExpressionStack.pop();

    return op1 + op2;
}
double subtractPostExpression(std::stack<double>& postExpressionStack) {
    double op1, op2;
    op2 = postExpressionStack.top();
    postExpressionStack.pop();
    op1 = postExpressionStack.top();
    postExpressionStack.pop();

    return op1 - op2;
}
double multiplyPostExpression(std::stack<double>& postExpressionStack) {
    double op1, op2;
    op2 = postExpressionStack.top();
    postExpressionStack.pop();
    op1 = postExpressionStack.top();
    postExpressionStack.pop();

    return op1 * op2;
}
double dividePostExpression(std::stack<double>& postExpressionStack) {
    double op1, op2;
    op2 = postExpressionStack.top();
    postExpressionStack.pop();
    op1 = postExpressionStack.top();
    postExpressionStack.pop();

    return op1 / op2;
}