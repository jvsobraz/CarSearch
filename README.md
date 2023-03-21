# DigitalBusinessEnablement

Uma API para o app de vendas e compras de veículos.

## Endpoints

- Veículos
    - Cadastrar
    - Mostrar detalhes
    - Apagar
    - Atualizar
    - Listar todos
- Contas
- Categorias

---

### Cadastrar Veículo

'POST' /api/veiculo

**Campos da requisição**

| campo | tipo | obrigatório | descrição
|-------|------|:-------------:|--------
| valor | decimal | sim      | o valor do veículo deve ser maior que R$1.000
| data  | data | sim         | a data do veículo
| categoria_id | int | sim | código de uma categoria previamente cadastrada
| conta_id | int | int | o código de uma conta previamente cadastrada
| descrição | texto | não | um texto sobre o veículo com no máximo de 255 caracteres

**Exemplo de corpo de requisição**

'''js

{
    valor: 70.000,
    data: '2023-02-28',
    categoria_id: 1,
    conta_id: 1,
    descricao: 'Carro'
}
'''

**Códigos da Resposta**

| código | descrição
|-|-
| 200 | veículo cadastrado com sucesso
| 404 | os campo enviados são inválidos

---

...
### Detalhar Veículo

'GET' /api/veiculo/{id}

**Exemplo de Corpo da Resposta**

'''js
{
    valor: 70.000,
    data: '2023-02-28',
    categoria: {
        categoria_id: 1,
        nome: 'SUV',
    },
    conta: {
        conta_id: 1,
        nome: 'João',
    },
    descricao: 'Carro'
}
'''

**Códigos da Resposta**

| código | descrição
|-|-
| 200 | veículo cadastrado com sucesso
| 404 | os campo enviados são inválidos
